package gr.ggeorgiadis.meditriage;

import java.time.LocalDateTime;

public class Patient {
    private String name;
    private String condition;
    private UrgencyLevel urgencyLevel;
    private LocalDateTime arrivalTime;

    public Patient(String name, String condition, UrgencyLevel urgencyLevel) {
        this.name = name;
        this.condition = condition;
        this.urgencyLevel = urgencyLevel;
        arrivalTime = LocalDateTime.now();
    }

    public UrgencyLevel getUrgencyLevel() {
        return urgencyLevel;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "Patient\n" +
                "Name: " + name + "\n" +
                "Condition: " + condition + "\n" +
                "Urgency Level: " + urgencyLevel + "\n" +
                "Arrival Time: " + arrivalTime + "\n";
    }
}
