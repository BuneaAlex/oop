package org.example;

import java.util.Objects;

public class Floor {
    private int floor;

    public Floor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Floor floor1 = (Floor) o;
        return floor == floor1.floor;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(floor);
    }
}
