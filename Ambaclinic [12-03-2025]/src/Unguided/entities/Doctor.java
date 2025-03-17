/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author fito
 */
public class Doctor {
    private String id; // ID Dokter
    private String name; // Nama Dokter
    private String specialty; // Spesialisasi Dokter

    // Konstruktor untuk menginisialisasi objek dokter
    public Doctor(String id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    // Getter untuk mendapatkan ID dokter
    public String getId() {
        return id;
    }

    // Getter untuk mendapatkan nama dokter
    public String getName() {
        return name;
    }

    // Getter untuk mendapatkan spesialisasi dokter
    public String getSpecialty() {
        return specialty;
    }

    /**
     * Mengembalikan informasi dokter dalam format string dengan bahasa Indonesia.
     * @return String yang berisi detail dokter
     */
    @Override
    public String toString() {
        return "Dokter [ID: " + id + ", Nama: " + name + ", Spesialisasi: " + specialty + "]";
    }
}
