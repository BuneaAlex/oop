package org.example;

public class FloorRequest {
    private final Floor to;
    private final Floor from;

    public FloorRequest(Floor to, Floor from) {
        this.to = to;
        this.from = from;
    }

    public Floor getTo() {
        return to;
    }

    public Floor getFrom() {
        return from;
    }
}
