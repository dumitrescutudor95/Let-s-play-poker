
package pkg9poker;

public class Carte {

    private int nr;
    private String tip;
    String[] tipC = {"♥", "♠", "♦", "♣"};

    public Carte() {
        nr = (int) (Math.floor(Math.random() * 8 +7 ));
        tip = tipC[(int) (Math.floor(Math.random() * 3 ))];
    }

    public int getNr() {
        return nr;
    }

    public String getTip() {
        return tip;
    }
    
    public String toString(){
    
        return String.valueOf(nr)+tip;
        
    }
    public boolean equals(Carte obj){
        if( nr==obj.getNr() && tip==obj.getTip()){
            return true;
        }
        else {
            return false;
        }
    }
}
