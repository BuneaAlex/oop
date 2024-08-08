package org.example;

public enum DistanceUnits {
    MILLIMETERS,
    METERS,
    KILOMETERS;

    public double toMillimeter(double value, DistanceUnits distanceUnits)
    {
        return switch (distanceUnits) {
            case MILLIMETERS -> value;
            case METERS -> value / 1000;
            case KILOMETERS -> value / 1000000;
        };

    }

    public double toMeter(double value, DistanceUnits distanceUnits)
    {
        return switch (distanceUnits) {
            case MILLIMETERS -> value * 1000;
            case METERS -> value;
            case KILOMETERS -> value / 1000;
        };

    }

    public double toKilometer(double value, DistanceUnits distanceUnits)
    {
        return switch (distanceUnits) {
            case MILLIMETERS -> value * 1000000;
            case METERS -> value * 1000;
            case KILOMETERS -> value;
        };

    }
}
