/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fito
 */
public class FuelTank {
    //Membuat variabel private karena hanya diakses oleh class ini saja
    private double fuelLevel; // Jumlah bahan bakar dalam liter
    private double capacity;  // Kapasitas maksimum tangki

    // Konstruktor untuk menentukan kapasitas tangki
    public FuelTank(double capacity) {
        this.capacity = capacity;
        this.fuelLevel = capacity; // Awalnya tangki penuh
    }

    // Method untuk mengurangi bahan bakar saat mobil berjalan
    public void consumeFuel() {
        // Jika bahan bakar masih tersedia (lebih dari 0 liter)
        if (fuelLevel > 0) {
            fuelLevel -= 1; // Konsumsi 1 liter per perjalanan
            System.out.println("Bahan bakar berkurang. Sisa: " + fuelLevel + " L");
        } else {
            // Jika bahan bakar habis, tampilkan peringatan
            System.out.println("Bahan bakar habis!");
        }
    }

    // Method untuk mengisi ulang bahan bakar
    public void refuel(double amount) {
        // Jika jumlah bahan bakar setelah pengisian tidak melebihi kapasitas tangki
        if (fuelLevel + amount <= capacity) {
            fuelLevel += amount;
            System.out.println("Mengisi bahan bakar " + amount + " L. Sisa bahan bakar sekarang: " + fuelLevel + " L");
        } else {
            // Jika jumlah bahan bakar melebihi kapasitas, tampilkan peringatan
            System.out.println("Tangki penuh! Kapasitas maksimum: " + capacity + " L");
        }
    }

    // Method untuk mendapatkan jumlah bahan bakar saat ini
    public double getFuelLevel() {
        return fuelLevel;
    }

    // Method untuk menampilkan informasi tangki bahan bakar
    public void displayInfo() {
        System.out.println("Kapasitas Tangki: " + capacity + " L, Sisa Bahan Bakar: " + fuelLevel + " L");
    }
}
