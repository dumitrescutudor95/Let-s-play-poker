/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9poker;

public class Poker {

    public static void Calculeaza(Mana p1, Mana p2) {

        if (p1.getValoare() > p2.getValoare()) {
            System.out.println("Player1 a castigat");
        } else if (p2.getValoare() > p1.getValoare()) {
            System.out.println("Player2 a castigat");
        } else {
            System.out.println("Remiza");
        }
    }

    public static void Calculeaza(Mana p1, Mana p2, Mana p3) {
        if (p1.getValoare() > p2.getValoare() && p1.getValoare() > p3.getValoare()) {
            System.out.println(p1.getName() + " a castigat");
        }
        else if (p2.getValoare() > p1.getValoare() && p2.getValoare() > p3.getValoare()) {
            System.out.println(p2.getName() + " a castigat");
        } else if (p3.getValoare() > p2.getValoare() && p3.getValoare() > p1.getValoare()) {
            System.out.println(p3.getName() + " a castigat");
        } else if (p2.getValoare() == p3.getValoare() && p2.getValoare() > p1.getValoare()) {
            System.out.println("Remiza intre " + p2.getName() + " si " + p3.getName());
        } else if (p1.getValoare() == p3.getValoare() && p1.getValoare() > p2.getValoare()) {
            System.out.println("Remiza intre " + p1.getName() + " si " + p3.getName());
        } else {
            System.out.println("Remiza");
        }

    }

    public static void main(String[] args) {
        Mana player1 = new Mana("Andrei");
        Mana player2 = new Mana("Diana");
        Mana player3 = new Mana("Sorin");
        Calculeaza(player1, player2, player3);
        
    
    }
}
