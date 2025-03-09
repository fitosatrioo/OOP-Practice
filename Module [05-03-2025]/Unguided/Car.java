/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Car {
    //Membuat variabel private karena hanya diakses oleh class ini saja
    private String brand; // Merek mobil
    private Engine engine; // Mesin mobil
    private Transmission transmission; // Transmisi mobil
    private Wheels wheels; // Roda mobil
    private FuelTank fuelTank; // Tangki bahan bakar

    // Konstruktor untuk menginisialisasi semua komponen mobil
    public Car(String brand, Engine engine, Transmission transmission, Wheels wheels, FuelTank fuelTank) {
        this.brand = brand;
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.fuelTank = fuelTank;
    }

    // Method untuk menyalakan mobil
    public void start() {
        // Mengecek apakah bahan bakar masih tersedia sebelum menyalakan mobil
        if (fuelTank.getFuelLevel() > 0) {
            System.out.println(brand + " sedang dinyalakan...");
            engine.startEngine();  // Menyalakan mesin jika ada bahan bakar
        } else {
             // Jika bahan bakar habis, tampilkan peringatan dan mobil tidak bisa dinyalakan
            System.out.println("Tangki bahan bakar kosong! Harap isi ulang.");
        }
    }

    // Metode untuk menjalankan mobil
    public void drive() {
        // Mengecek apakah bahan bakar masih tersedia sebelum mobil bisa berjalan
        if (fuelTank.getFuelLevel() > 0) {
            System.out.println(brand + " sedang berjalan...");
            transmission.shiftGear();  // Mengoper gigi
            wheels.rotate(); // Memutar roda
            fuelTank.consumeFuel(); // Mengurangi bahan bakar setiap perjalanan
        } else {
            // Jika bahan bakar habis, mobil tidak bisa berjalan
            System.out.println("Bahan bakar habis! Tidak bisa menjalankan mobil.");
        }
    }

    // Metode untuk menghentikan mobil
    public void stop() {
        System.out.println(brand + " sedang berhenti...");
        engine.stopEngine();
    }

    // Metode untuk menampilkan informasi mobil
    public void displayInfo() {
        System.out.println("Merek Mobil: " + brand);
        engine.displayInfo();
        transmission.displayInfo();
        wheels.displayInfo();
        fuelTank.displayInfo();
        System.out.println("========================");
    }
}

