import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Baralho {
    protected List<CartaAntiga> deck = new ArrayList<CartaAntiga>();
    protected int NUMBER_OF_CARDS;
    protected Random randomNumbers = new Random();

    abstract boolean hasCard();
    abstract void createCards();
    abstract void shuffle();
    abstract CartaAntiga dealCard();
    abstract int size();
    public abstract String toString();
}