public class Banker {
    private int chips;
    public Banker() {
        chips = 1000;
    }
    public void myTurn() {
        Die.roll();
    }
}
