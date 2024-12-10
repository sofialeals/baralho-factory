public class BaralhoUno extends Baralho{

    public BaralhoUno(){
        this.NUMBER_OF_CARDS = 113;
    }

    @Override
    void createCards() {

    }

    @Override
    boolean hasCard() {
        return false;
    }

    @Override
    void shuffle() {

    }

    @Override
    CartaAntiga dealCard() {
        return null;
    }

    @Override
    int size() {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
