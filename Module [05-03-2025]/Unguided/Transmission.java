/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fito
 */
public class Transmission {
    // Membuat variabel private karena hanya diakses oleh class ini saja
    private String type; // Jenis transmisi (Manual/Automatic)

    // Konstruktor untuk menentukan jenis transmisi
    public Transmission(String type) {
        this.type = type;
    }

    // Method untuk mengganti gigi
    public void shiftGear() {
        System.out.println("Mengganti gigi pada transmisi " + type + ".");
    }

    // Method untuk menampilkan informasi transmisi
    public void displayInfo() {
        System.out.println("Jenis Transmisi: " + type);
    }
}
