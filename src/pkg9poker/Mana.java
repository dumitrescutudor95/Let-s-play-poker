/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9poker;


public class Mana extends Carte {

    private String nume;
    private int valoare = 0;
    Carte[] c = new Carte[5];

     public int getValoare() {
        return valoare;
    }
     public String getName(){
         return nume;
     }
     
    public Mana(String nume) {
        this.nume=nume;
        c[0] = new Carte();
        c[1] = new Carte();
        c[2] = new Carte();
        c[3] = new Carte();
        c[4] = new Carte();
        for (int i = 0; i < 3; i++) {
             for (int j = i + 1; j <= 4; j++) {
                if (c[j].equals(c[i])) {
                    c[j] = new Carte();
                }
            }
        }
     

    
      
        System.out.println("Player name: " +nume);
        for (int i = 0; i < 5; i++) {
           switch (c[i].getNr()) {
                case 11:

                    System.out.print("A" + c[i].getTip() + "  ");
                    break;
                case 12:
                    System.out.print("J" + c[i].getTip() + "  ");
                    break;
                case 13:
                    System.out.print("Q" + c[i].getTip() + "  ");
                    break;
                case 14:
                    System.out.print("K" + c[i].getTip() + "  ");
                    break;
                default:
                    System.out.print(c[i] + "" + "  ");
                    break;
            }
        }

        if (c[0].getTip() == c[1].getTip() && c[1].getTip() == c[2].getTip() && c[2].getTip() == c[3].getTip() && c[3].getTip() == c[4].getTip()) {
            System.out.println("");
            System.out.println("Culoare!");   //culoare
            valoare += 7;
        } //chinta ?
        else if ((c[0] == c[1] && c[1] == c[2] && c[2] == c[3])
                || (c[0].getNr() == c[1].getNr() && c[1].getNr() == c[4].getNr() && c[4].getNr() == c[2].getNr())
                || (c[0].getNr() == c[1].getNr() && c[1].getNr() == c[3].getNr() && c[3].getNr() == c[4].getNr())
                || (c[0].getNr() == c[2].getNr() && c[2].getNr() == c[3].getNr() && c[3].getNr() == c[4].getNr())
                || (c[1].getNr() == c[2].getNr() && c[2].getNr() == c[3].getNr() && c[3].getNr() == c[4].getNr())) {
            System.out.println("");
            System.out.println("Careu");
            valoare = 5;                   //careu
        } else if ((c[0].getNr() == c[1].getNr() && (c[2].getNr() == c[3].getNr() && c[3].getNr() == c[4].getNr()))
                || (c[0].getNr() == c[2].getNr() && (c[1].getNr() == c[3].getNr() && c[3].getNr() == c[4].getNr()))
                || (c[0].getNr() == c[3].getNr() && (c[1].getNr() == c[2].getNr() && c[2].getNr() == c[4].getNr()))
                || (c[0].getNr() == c[4].getNr() && (c[1].getNr() == c[2].getNr() && c[2].getNr() == c[3].getNr()))
                || (c[1].getNr() == c[2].getNr() && (c[3].getNr() == c[4].getNr() && c[0].getNr() == c[4].getNr()))
                || (c[1].getNr() == c[3].getNr() && (c[2].getNr() == c[4].getNr() && c[0].getNr() == c[4].getNr()))
                || (c[1].getNr() == c[4].getNr() && (c[0].getNr() == c[2].getNr() && c[2].getNr() == c[3].getNr()))
                || (c[2].getNr() == c[3].getNr() && (c[0].getNr() == c[1].getNr() && c[1].getNr() == c[4].getNr()))
                || (c[2].getNr() == c[4].getNr() && (c[0].getNr() == c[1].getNr() && c[1].getNr() == c[3].getNr()))
                || (c[3].getNr() == c[4].getNr() && (c[0].getNr() == c[1].getNr() && c[1].getNr() == c[2].getNr()))) {
            System.out.println("");
            System.out.println("Full");
            valoare += 4;                     //full
        } else if ((c[2].getNr() == c[3].getNr() && c[3].getNr() == c[4].getNr())
                || (c[1].getNr() == c[3].getNr() && c[3].getNr() == c[4].getNr())
                || (c[1].getNr() == c[2].getNr() && c[2].getNr() == c[4].getNr())
                || (c[1].getNr() == c[2].getNr() && c[2].getNr() == c[3].getNr())
                || (c[3].getNr() == c[4].getNr() && c[0].getNr() == c[4].getNr())
                || (c[2].getNr() == c[4].getNr() && c[0].getNr() == c[4].getNr())
                || (c[0].getNr() == c[2].getNr() && c[2].getNr() == c[3].getNr())
                || (c[0].getNr() == c[1].getNr() && c[1].getNr() == c[4].getNr())
                || (c[0].getNr() == c[1].getNr() && c[1].getNr() == c[3].getNr())
                || (c[0].getNr() == c[1].getNr() && c[1].getNr() == c[2].getNr())) {
            System.out.println("");
            System.out.println("Trei bucati");
            valoare += 3;
        } else if ((c[0].getNr() == c[1].getNr() && (c[2].getNr() == c[3].getNr() || c[3].getNr() == c[4].getNr()))
                || (c[0].getNr() == c[3].getNr() && (c[1].getNr() == c[2].getNr() || c[2].getNr() == c[4].getNr()))
                || (c[0].getNr() == c[4].getNr() && (c[1].getNr() == c[2].getNr() || c[2].getNr() == c[3].getNr()))
                || (c[1].getNr() == c[2].getNr() && (c[3].getNr() == c[4].getNr() || c[0].getNr() == c[4].getNr()))
                || (c[1].getNr() == c[3].getNr() && (c[2].getNr() == c[4].getNr() || c[0].getNr() == c[4].getNr()))
                || (c[1].getNr() == c[4].getNr() && (c[0].getNr() == c[2].getNr() || c[2].getNr() == c[3].getNr()))
                || (c[2].getNr() == c[3].getNr() && (c[0].getNr() == c[1].getNr() || c[1].getNr() == c[4].getNr()))
                || (c[2].getNr() == c[4].getNr() && (c[0].getNr() == c[1].getNr() || c[1].getNr() == c[3].getNr()))
                || (c[3].getNr() == c[4].getNr() && (c[0].getNr() == c[1].getNr() || c[1].getNr() == c[2].getNr()))) {
            System.out.println("");
            System.out.println("Doua perechi");
            valoare += 2;
        } else if (c[0].getNr() == c[1].getNr()
                || c[0].getNr() == c[2].getNr()
                || c[0].getNr() == c[3].getNr()
                || c[0].getNr() == c[4].getNr()
                || c[1].getNr() == c[2].getNr()
                || c[1].getNr() == c[3].getNr()
                || c[1].getNr() == c[4].getNr()
                || c[2].getNr() == c[3].getNr()
                || c[2].getNr() == c[4].getNr()
                || c[3].getNr() == c[4].getNr()) {
            System.out.println("");
            System.out.println("O pereche");
            valoare += 1;
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

    
}
}
