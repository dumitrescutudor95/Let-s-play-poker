
package pkg9poker;

public class Carte {

    private final int nr;
    private final String tip;
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
    @Override
    public boolean equals(Object o){
     
        if( nr==((Carte)o).getNr() && tip==((Carte)o).getTip()){
            return true;
        }
        else {
            return false;
        }
    }
}
