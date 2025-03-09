/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Engine {
    // Membuat variabel private karena hanya diakses oleh class ini saja
    private int horsepower; // Daya mesin dalam HP
    private String type; // Jenis mesin (Bensin, Diesel, Listrik, dll.)

    // Konstruktor untuk mengatur daya dan jenis mesin
    public Engine(int horsepower, String type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    // Method untuk menyalakan mesin
    public void startEngine() {
        System.out.println("Mesin dinyalakan dengan daya " + horsepower + " HP (" + type + ")");
    }

    // Method untuk mematikan mesin
    public void stopEngine() {
        System.out.println("Mesin dimatikan...");
    }

    // Method untuk menampilkan informasi mesin
    public void displayInfo() {
        System.out.println("Mesin: " + horsepower + " HP, Jenis: " + type);
    }
}
