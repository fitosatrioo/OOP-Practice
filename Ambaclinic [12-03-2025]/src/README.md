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
Ambaclinic [12-03-2025]/
└── src/
    ├── Guided/
    │   ├── Driver/
    │   │   ├── TestPackages.java
    │   ├── HargaBuku/
    │   │   ├── Harga.java
    │   ├── Token/
    │   │   ├── KelasToken.java
    │   ├── Animal.java
    │   ├── Cat.java
    │   ├── LibraryBook.java
    ├── Unguided/
    │   ├── entities/
    │   │   ├── Doctor.java
    │   │   ├── Patient.java
    │   │   ├── Appointment.java
    │   │   ├── DataChecker.java
    ├── ClinicSystem.java
└── README.md
```

---

## Classes Description

### Doctor.java
This class represents a **Doctor** with:
- An ID (id)
- A name (name)
- A specialization (specialty)

**Methods:**
- getId(): Returns the doctor’s ID.
- getName(): Returns the doctor’s name.
- getSpecialty(): Returns the doctor’s specialty.
- toString(): Returns doctor information in a formatted string.

---

### Patient.java
This class represents a **Patient** with:
- An ID (id)
- A name (name)
- An age (age)
- A list of diagnoses (diagnoses)

**Methods:**
- getId(): Returns the patient’s ID.
- getName(): Returns the patient’s name.
- getAge(): Returns the patient’s age.
- addDiagnosis(String diagnosis): Adds a diagnosis to the patient’s record.
- getDiagnoses(): Returns a list of the patient’s diagnoses.
- toString(): Returns patient information in a formatted string.

---

### Appointment.java
This class represents an **Appointment** between a doctor and a patient.

**Attributes:**
- doctor: The assigned doctor.
- patient: The patient.
- dateTime: The appointment date and time.

**Methods:**
- getDoctor(): Returns the assigned doctor.
- getPatient(): Returns the patient.
- getDateTime(): Returns the appointment date and time.
- toString(): Returns appointment details in a readable format.

---

### DataChecker.java
This utility class validates input data such as names, ages, and IDs.

**Validation Methods:**
- isValidName(String name): Ensures names have at least 3 letters and contain only alphabets and spaces.
- isValidAge(int age): Ensures age is between 1 and 109.
- isValidID(String id): Ensures ID is between 4-10 characters, containing uppercase letters and numbers only.

---

### ClinicSystem.java
This is the **main class** that provides the system interface.

**Main functionalities:**
1. **Registers patients**
2. **Schedules doctor appointments**
3. **Displays scheduled appointments**
4. **Shows diagnosis statistics**


## How to Run the Program
1. Compile the Java files:
```nginx
javac Unguided/entities/*.java ClinicSystem.java
```
   
2. Run the application:
```nginx
java ClinicSystem
```

## Documentation 
