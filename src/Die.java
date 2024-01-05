public class Die {
    private int die;
    public Die() {
        die = 0;
    }
    public void roll() {
        die = (int)(Math.random() * 6 + 1);
    }
    public int getDie() {
        return die;
    }
    public boolean automaticWin() {
        if (die1 == die2 && die2 = die3 && die3 == die1) {
            return true;
        } else if (die1 == 4 && die2 == 5 && die3 == 6) {
            return true;
        } else if (die1 == 1 && die2 == 2 && die3 == 3) {
            return false;
        } else {
            return false;
        }
    }

    public int score() {
        if (automaticWin() == false) {
            if (die1 != die2 && die1 != die3 && die2 = die3) {
                return die1;
            } else if (die2 != die1 && die2 != die3 && die1 = die3) {
                return die2;
            } else if (die3 != die2 && die3 != die1 && die2 = die1) {
                return die3;
            } else {
                return 0;
            }
        }
    }

    /*
     */
}

