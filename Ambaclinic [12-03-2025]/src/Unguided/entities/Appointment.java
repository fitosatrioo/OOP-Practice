/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

//import entities.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author fito
 */
public class Appointment {
    private Doctor doctor;      // Dokter yang menangani janji temu
    private Patient patient;    // Pasien yang akan menjalani janji temu
    private LocalDateTime dateTime; // Waktu janji temu

    /**
     * Konstruktor untuk membuat janji temu baru.
     * @param doctor Dokter yang menangani janji temu.
     * @param patient Pasien yang akan berkonsultasi.
     * @param dateTime Waktu janji temu.
     */
    public Appointment(Doctor doctor, Patient patient, LocalDateTime dateTime) {
        this.doctor = doctor;
        this.patient = patient;
        this.dateTime = dateTime;
    }

    /**
     * Mengembalikan dokter yang menangani janji temu ini.
     * @return Dokter.
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Mengembalikan pasien yang terlibat dalam janji temu ini.
     * @return Pasien.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Mengembalikan waktu janji temu.
     * @return Waktu janji temu dalam format LocalDateTime.
     */
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Mengembalikan representasi string dari objek janji temu.
     * Format tampilan lebih mudah dipahami dengan tanggal yang diformat dengan baik.
     * @return String yang mendeskripsikan janji temu.
     */
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return "Janji Temu:\n" +
               "Dokter   : " + doctor.getName() + " (" + doctor.getSpecialty() + ")\n" +
               "Pasien   : " + patient.getName() + " (Usia: " + patient.getAge() + ")\n" +
               "Waktu    : " + dateTime.format(formatter);
    }
}
