/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Cat extends Animal {
@Override
    public void bark() {
        System.out.println("Bark Bark Cihuyyy");
    }
    public static void main(String[] args) {
        Cat gurame = new Cat();
        gurame.bark();
    }
}
