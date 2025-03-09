/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fito
 */
public class Wheels {
    // Membuat variabel private karena hanya diakses oleh class ini saja
    private int size; // Ukuran roda dalam inci
    private String type; // Jenis roda (All-Terrain, Sport, dll.)

    // Konstruktor untuk mengatur ukuran dan jenis roda
    public Wheels(int size, String type) {
        this.size = size;
        this.type = type;
    }

    // Method untuk memutar roda saat mobil berjalan
    public void rotate() {
        System.out.println("Roda berputar dengan ukuran " + size + " inci (" + type + ").");
    }

    // Method untuk menampilkan informasi roda
    public void displayInfo() {
        System.out.println("Ukuran Roda: " + size + " inci, Jenis: " + type);
    }
}
