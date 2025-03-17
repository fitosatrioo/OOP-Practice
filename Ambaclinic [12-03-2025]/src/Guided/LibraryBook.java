/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class LibraryBook {
    private String title;
    private String author;
    private boolean isBorrowed;

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getStatus() {
        return isBorrowed;
    }

    // Main method
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook();
        lb.setTitle("Dongeng Si Kancil");
        lb.setAuthor("Nopal");
        lb.setIsBorrowed(true);

        // Corrected method calls
        System.out.println("Title: " + lb.getTitle());
        System.out.println("Author: " + lb.getAuthor());
        System.out.println("Is Borrowed? " + lb.getStatus());
    }
  
}
