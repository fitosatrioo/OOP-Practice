/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author fito
 */
public class Patient {
    private String id;  // ID Pasien
    private String name;  // Nama Pasien
    private int age;  // Usia Pasien
    private Map<String, Integer> diagnoses;  // // Diagnosis counter

    // Konstruktor untuk inisialisasi pasien
    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diagnoses = new HashMap<>();
    }

    // Getter untuk ID pasien
    public String getId() {
        return id;
    }

    // Getter untuk nama pasien
    public String getName() {
        return name;
    }

    // Getter untuk usia pasien
    public int getAge() {
        return age;
    }

    /**
     * Menambahkan diagnosis ke pasien dan menghitung jumlah diagnosis yang sama
     * @param diagnosis Diagnosis yang diberikan ke pasien
     */
    public void addDiagnosis(String diagnosis) {
        diagnoses.put(diagnosis, diagnoses.getOrDefault(diagnosis, 0) + 1);
    }

    // Getter untuk mendapatkan daftar diagnosis dan jumlahnya
    public Map<String, Integer> getDiagnoses() {
        return diagnoses;
    }

    /**
     * Mengembalikan informasi pasien dalam format string dengan output dalam bahasa Indonesia.
     * @return String yang berisi detail pasien dan daftar diagnosa
     */
    @Override
    public String toString() {
        return "Pasien [ID: " + id + ", Nama: " + name + ", Usia: " + age + 
               ", Daftar Diagnosis: " + diagnoses + "]";
    }
}
