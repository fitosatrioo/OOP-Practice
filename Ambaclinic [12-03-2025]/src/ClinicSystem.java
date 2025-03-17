
import Unguided.entities.Appointment;
import Unguided.entities.DataChecker;
import Unguided.entities.Doctor;
import Unguided.entities.Patient;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author user
 */
public class ClinicSystem {
    // List untuk menyimpan data dokter, pasien, dan janji temu

    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();
    private static List<Appointment> appointments = new ArrayList<>();

    // Map untuk menghitung jumlah setiap diagnosis yang dimasukkan
    private static Map<String, Integer> diagnosisCounter = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menambahkan beberapa dokter awal ke dalam sistem
        doctors.add(new Doctor("D001", "Dr. Ambappe", "Kardiologi"));
        doctors.add(new Doctor("D002", "Dr. Ambathuram", "Dermatologi"));
        doctors.add(new Doctor("D003", "Dr. Asngawi", "Neurologi"));
        doctors.add(new Doctor("D004", "Dr. Devilician", "Ortopedi"));
        doctors.add(new Doctor("D005", "Dr. Sumanto", "Pediatri"));

        // Perulangan utama untuk menampilkan menu kepada pengguna
        while (true) {
            System.out.println("\n=== WELCOME TO AMBA CLINIC ===");
            System.out.println("1. Registrasi Pasien");
            System.out.println("2. Buat Janji Temu");
            System.out.println("3. Lihat Daftar Janji Temu");
            System.out.println("4. Lihat Statistik Diagnosis");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt(); // Membaca input angka dari pengguna
            scanner.nextLine(); // Membuang karakter newline setelah angka

            // Menjalankan fungsi berdasarkan pilihan pengguna
            switch (choice) {
                case 1:
                    registerPatient(scanner);
                    break;
                case 2:
                    scheduleAppointment(scanner);
                    break;
                case 3:
                    viewAppointments();
                    break;
                case 4:
                    viewDiagnosisStats();
                    break;
                case 5:
                    System.out.println("Keluar dari sistem...");
                    scanner.close(); // Menutup scanner sebelum keluar
                    return;
                default:
                    System.out.println("Opsi tidak valid! Silakan coba lagi.");
            }
        }
    }

    /**
     * Fungsi untuk mendaftarkan pasien baru.
     */
    private static void registerPatient(Scanner scanner) {
        System.out.print("Masukkan ID Pasien: ");
        String id = scanner.nextLine();

        // Mengecek apakah ID sudah terdaftar
        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                System.out.println("ID pasien sudah terdaftar! Gunakan ID lain.");
                return;
            }
        }

        // Validasi format ID pasien
        if (!DataChecker.isValidID(id)) {
            System.out.println("Format ID tidak valid!");
            return;
        }

        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();

        // Validasi format nama pasien
        if (!DataChecker.isValidName(name)) {
            System.out.println("Format nama tidak valid!");
            return;
        }

        System.out.print("Masukkan Usia: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        // Validasi batas usia pasien
        if (!DataChecker.isValidAge(age)) {
            System.out.println("Usia tidak valid!");
            return;
        }

        // Menambahkan pasien ke dalam daftar pasien
        Patient patient = new Patient(id, name, age);
        patients.add(patient);
        System.out.println("Pasien berhasil didaftarkan!");
    }

    /**
     * Fungsi untuk menjadwalkan janji temu antara pasien dan dokter.
     */
    private static void scheduleAppointment(Scanner scanner) {
        if (patients.isEmpty()) {
            System.out.println("Belum ada pasien yang terdaftar.");
            return;
        }

        // Menampilkan daftar dokter yang tersedia
        System.out.println("\n=== Daftar Dokter ===");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println((i + 1) + ". " + doctors.get(i));
        }

        System.out.print("Pilih Dokter (1-" + doctors.size() + "): ");
        int doctorChoice = scanner.nextInt();
        scanner.nextLine();

        // Validasi pilihan dokter
        if (doctorChoice < 1 || doctorChoice > doctors.size()) {
            System.out.println("Pilihan dokter tidak valid.");
            return;
        }
        Doctor selectedDoctor = doctors.get(doctorChoice - 1);

        // Menampilkan daftar pasien yang terdaftar
        System.out.println("\n=== Daftar Pasien ===");
        for (int i = 0; i < patients.size(); i++) {
            System.out.println((i + 1) + ". " + patients.get(i));
        }

        System.out.print("Pilih Pasien (1-" + patients.size() + "): ");
        int patientChoice = scanner.nextInt();
        scanner.nextLine();

        // Validasi pilihan pasien
        if (patientChoice < 1 || patientChoice > patients.size()) {
            System.out.println("Pilihan pasien tidak valid.");
            return;
        }
        Patient selectedPatient = patients.get(patientChoice - 1);

        // Memasukkan diagnosis pasien
        System.out.print("Masukkan Diagnosis: ");
        String diagnosis = scanner.nextLine();
        selectedPatient.addDiagnosis(diagnosis);

        // Menyimpan jumlah diagnosis yang sudah dicatat
        diagnosisCounter.put(diagnosis, diagnosisCounter.getOrDefault(diagnosis, 0) + 1);

        // Menjadwalkan janji temu untuk besok
        LocalDateTime appointmentTime = LocalDateTime.now().plusDays(1);
        Appointment appointment = new Appointment(selectedDoctor, selectedPatient, appointmentTime);
        appointments.add(appointment);

        System.out.println("Janji temu berhasil dijadwalkan!");
    }

    /**
     * Fungsi untuk melihat daftar janji temu yang sudah dibuat.
     */
    private static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("Belum ada janji temu.");
            return;
        }

        System.out.println("\n=== Daftar Janji Temu ===");
        for (Appointment app : appointments) {
            System.out.println(app);
        }
    }

    /**
     * Fungsi untuk melihat statistik jumlah diagnosis yang telah dicatat.
     */
    private static void viewDiagnosisStats() {
        if (diagnosisCounter.isEmpty()) {
            System.out.println("Belum ada diagnosis tercatat.");
            return;
        }

        System.out.println("\n=== Statistik Diagnosis ===");
        for (Map.Entry<String, Integer> entry : diagnosisCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " kali");
        }
    }
}
