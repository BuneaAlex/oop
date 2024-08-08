package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Building {
    private final List<Elevator> elevators;
    private final List<FloorRequest> floorRequestList;

    public Building(List<Elevator> elevators) {
        this.elevators = elevators;
        this.floorRequestList = new ArrayList<>();
    }

    private void scheduling()
    {
        for(FloorRequest request : floorRequestList)
        {
            if(useStandingElevatorForFloorIfExists(request))
                return;

        }
    }

    private boolean useStandingElevatorForFloorIfExists(final FloorRequest request) {
        Optional<Elevator> standingElevator = getStandingElevatorForFloor(request.getFrom());
        if(standingElevator.isPresent())
        {
            FloorRequest floorRequest = new FloorRequest(request.getFrom(), request.getTo());
            standingElevator.get().addNewFloorRequest(floorRequest);
            return true;
        }
        return false;
    }

    private Optional<Elevator> getStandingElevatorForFloor(final Floor floor)
    {
        for(Elevator elevator : elevators)
        {
            if(elevator.getCurrentFloor().equals(floor))
                return Optional.of(elevator);

        }

        return Optional.empty();

    }
}
