package gr.ggeorgiadis.meditriage;

import java.util.PriorityQueue;

public class MediTriageApp {
    public static void main(String[] args) throws InterruptedException {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(new PatientStatusComparator());

        // Test data
        triageQueue.add(new Patient("Alice", "Head injury", UrgencyLevel.SEVERE));
        Thread.sleep(1000); // Simulate time gap
        triageQueue.add(new Patient("Bob", "Chest pain", UrgencyLevel.SEVERE));
        Thread.sleep(1000);
        triageQueue.add(new Patient("Charlie", "Cold", UrgencyLevel.LOW));
        triageQueue.add(new Patient("Diana", "Broken leg", UrgencyLevel.MODERATE));

        System.out.println("Treating patients in order:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll());
        }
    }
}
