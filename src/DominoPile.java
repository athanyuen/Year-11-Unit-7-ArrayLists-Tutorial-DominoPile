import java.util.ArrayList;
import java.util.Collections;

public class DominoPile {
    private ArrayList<Domino> pile;
    public DominoPile(){
        pile = new ArrayList<Domino>();
    }
    public ArrayList<Domino> getPile(){
        return pile;
    }
    public void newStack6() {
        for (int i = 0; i < 7; i++){
            for(int k = i; k <= 6; k++){
                pile.add(new Domino(i, k));
            }
        }
    }
    public void shuffleOptionOne(){
        ArrayList<Domino> newPile = new ArrayList<Domino>();
        while (!pile.isEmpty()) {
            int index = (int) (Math.random() * pile.size());
            newPile.add(pile.remove(index));
        }
        pile = newPile;
    }
    public void shuffleOptionTwo(){
        int numShuffles = 100000;
        for (int i = 0; i < numShuffles; i++) {
            int index1 = (int) (Math.random() * pile.size());
            int index2 = (int) (Math.random() * pile.size());
            Collections.swap(pile, index1, index2);
        }
    }

}
