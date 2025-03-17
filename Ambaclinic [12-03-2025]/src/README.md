# AMBA Clinic System

## Overview
The **AMBA Clinic System** is a simple Java-based application that manages doctor appointments, patient registration, and diagnosis tracking. The system allows users to:
- Register new patients.
- Schedule appointments between doctors and patients.
- View a list of scheduled appointments.
- Track diagnosis statistics.

## Features
### 1. Patient Registration  
- Registers new patients with a unique ID, name, and age.
- Ensures data validation for name format, age range, and ID format.

### 2. Appointment Scheduling  
- Allows users to schedule an appointment between a registered patient and an available doctor.
- Assigns a diagnosis to the patient during the appointment.
- Automatically schedules appointments for the next day.

### 3. View Appointments  
- Displays a list of all scheduled appointments.
- Shows details such as doctor name, specialization, patient name, age, and appointment date.

### 4. Diagnosis Statistics  
- Tracks and displays the frequency of each diagnosis made.

---

## Project Structure

```

├── src
│   ├── Unguided/entities
│   │   ├── Appointment.java
│   │   ├── Doctor.java
│   │   ├── Patient.java
│   │   ├── DataChecker.java
│   ├── ClinicSystem.java
├── README.md


```

---
