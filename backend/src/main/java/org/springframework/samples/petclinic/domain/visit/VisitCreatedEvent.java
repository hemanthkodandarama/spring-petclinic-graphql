package org.springframework.samples.petclinic.domain.visit;

public class VisitCreatedEvent {

    private final Visit visit;

    public VisitCreatedEvent(Visit visit) {
        this.visit = visit;
    }

    public Visit getVisit() {
        return visit;
    }

    @Override
    public String toString() {
        return "VisitCreatedEvent{" +
            "visit=" + visit +
            '}';
    }
}