/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Dosen {
    private String kodeDosen;
    private String namaDosen;
   
    //Setter
    public void setKodeDosen(String kodeDosen){
    this.kodeDosen = kodeDosen;
    }
    public void setNamaDosen(String namaDosen){
    this.namaDosen = namaDosen;
    }
    //Getter
    public String getKodeDosen(){
    return this.kodeDosen;
    }
    public String getNamaDosen(){
    return this.namaDosen;
    }
   
    public void giveScore(Mahasiswa student, int nilai){
   // ini asosiasi, method milik class Student dipanggil di class Dosen,
    // tp objek Student tidak menjadi atribut dr class Lecture
    student.setNilai(nilai);
    }
    public int getScore(Mahasiswa student){
   // ini asosiasi, method milik class Student dipanggil di class Lecture,
    // tp objek Student tidak menjadi atribut dr class Lecture
    return student.getNilai();
    }
   
    public static void main(String[] args) {
    Mahasiswa student  = new Mahasiswa();
   
    student.setNim("130118383");
    student.setNama("Budi");
   
    Dosen instructor = new Dosen();
    instructor.giveScore(student, 90);
   
    System.out.println("Nim :"+student.getNim());
    System.out.println("Nama :"+student.getNama());
    System.out.println("Nilai :"+instructor.getScore(student));
    }
}
