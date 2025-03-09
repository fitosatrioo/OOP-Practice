/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Main {
 public static void main(String[] args) {
        // Membuat objek komponen mobil yang sudah terdapat pada kelas lain
        Engine engine = new Engine(200, "Bensin");
        Transmission transmission = new Transmission("Otomatis");
        Wheels wheels = new Wheels(18, "All-Terrain");
        FuelTank fuelTank = new FuelTank(50); // Kapasitas tangki 50 liter

        // Membuat objek mobil dengan semua komponennya
        Car car = new Car("Bugatti", engine, transmission, wheels, fuelTank);

        // Menampilkan informasi mobil
        car.displayInfo();

        // Menyalakan dan mengemudikan mobil
        car.start();
        System.out.println("========================");
        car.drive();
        System.out.println("========================");
        car.drive(); // Mengemudi dua kali untuk menghabiskan bahan bakar
        System.out.println("========================");
        fuelTank.refuel(10); // Mengisi ulang 10 liter bahan bakar
        System.out.println("========================");
        car.drive();
        System.out.println("========================");
        car.stop();
    }
}
