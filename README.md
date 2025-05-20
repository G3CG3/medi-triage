# Medi-Triage

A Java-based Hospital Triage System that prioritizes patients based on urgency levels and arrival time. This system uses a priority queue with a custom comparator to ensure patients with more critical conditions are treated first, simulating real-world emergency room triage.

---

## Features

- Patient urgency defined using an ENUM (`CRITICAL`, `SEVERE`, `MODERATE`, `MILD`)
- Automatic timestamping of patient arrival
- Custom comparator prioritizing by urgency, then arrival time
- PriorityQueue to manage patient ordering efficiently

---

## Usage

1. Create patients with name, condition, and urgency level.
2. Add patients to the triage queue.
3. Poll patients from the queue in order of priority for treatment.

---

## Project Structure
Patient.java — Patient data model

UrgencyLevel.java — Enum for urgency levels

PatientStatusComparator.java — Comparator to order patients by urgency and arrival time

MediTriageApp.java — Main application class

---

## How to Run

1. Compile the project in your IDE (e.g., IntelliJ).
2. Run the main application class `MediTriageApp`.
3. Observe the console output showing patients being prioritized and processed based on urgency and arrival time.

---

## Sample Output

>Patient <br>
Name: Alice <br>
Condition: Head injury <br>
Urgency Level: SEVERE <br>
Arrival Time: 2025-05-20 14:33:12

>Patient <br>
Name: Bob <br>
Condition: Broken arm <br>
Urgency Level: MODERATE <br>
Arrival Time: 2025-05-20 14:35:45

## License

This project is licensed under the MIT License - see the LICENSE file for details.

---

Feel free to expand this project by adding more patient attributes, integrating with a GUI, or simulating real-time triage scenarios!