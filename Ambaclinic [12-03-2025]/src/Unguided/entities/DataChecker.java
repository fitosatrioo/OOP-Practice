/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author fito
 */
public class DataChecker {
     /**
     * Memeriksa apakah nama valid.
     * Nama harus memiliki minimal 3 huruf dan hanya boleh berisi huruf dan spasi.
     * @param name Nama yang akan diperiksa.
     * @return true jika nama valid, false jika tidak valid.
     */
    public static boolean isValidName(String name) {
        return name != null && name.matches("^[a-zA-Z ]{3,}$");
    }

    /**
     * Memeriksa apakah usia valid.
     * Usia harus lebih dari 0 dan kurang dari 120 tahun.
     * @param age Usia yang akan diperiksa.
     * @return true jika usia valid, false jika tidak valid.
     */
    public static boolean isValidAge(int age) {
        return age > 0 && age < 110;
    }

    /**
     * Memeriksa apakah ID valid.
     * ID harus terdiri dari huruf besar (A-Z) dan angka (0-9) dengan panjang 4-10 karakter.
     * @param id ID yang akan diperiksa.
     * @return true jika ID valid, false jika tidak valid.
     */
    public static boolean isValidID(String id) {
        return id != null && id.matches("^[A-Z0-9]{4,10}$");
    }
}
