package org.example;

import java.util.ArrayList;
import java.util.List;

public class Elevator {

    private Direction direction;
    private Floor currentFloor;
    private final List<FloorRequest> floorRequest;

    public Elevator()
    {
        direction = Direction.STAND;
        currentFloor = new Floor(0);
        floorRequest = new ArrayList<>();
    }

    public void addNewFloorRequest(final FloorRequest request)
    {
        floorRequest.add(request);
    }

    public void removeRequest(final FloorRequest request)
    {
        floorRequest.remove(request);
    }

    //region getset
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setCurrentFloor(Floor currentFloor) {
        this.currentFloor = currentFloor;
    }


    public Direction getDirection() {
        return direction;
    }

    public Floor getCurrentFloor() {
        return currentFloor;
    }

    public List<FloorRequest> getFloorRequest() {
        return floorRequest;
    }

    //endregion
}
