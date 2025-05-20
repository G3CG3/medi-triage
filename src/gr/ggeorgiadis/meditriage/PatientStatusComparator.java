package gr.ggeorgiadis.meditriage;

import java.util.Comparator;

public class PatientStatusComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        int urgencyComparison = Integer.compare(p1.getUrgencyLevel().ordinal(), p2.getUrgencyLevel().ordinal());

        if (urgencyComparison != 0)
            return urgencyComparison;
        return p1.getArrivalTime().compareTo(p2.getArrivalTime());
    }
}
