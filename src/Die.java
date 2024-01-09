public class Die {
    private int die;
    private int[] dice;
    public Die() {
        die = 0;
    }
    public void createDice() {
        Die die1 = new Die();
        Die die2 = new Die();
        Die die3 = new Die();
        Die[] dice = {die1, die2, die3};
    }
    public void roll() {
        die = (int)(Math.random() * 6 + 1);
    }
    public int getDie() {
        return die;
    }
    public boolean automaticWin() {
        if (dice[1] == dice[2] && dice[2] == dice[3] && dice[3] == dice[1]) {
            return true;
        } else if (dice[1] == 4 && dice[2] == 5 && dice[3] == 6) {
            return true;
        } else if (dice[1] == 1 && dice[2] == 2 && dice[3] == 3) {
            return false;
        } else {
            return false;
        }
    }

    public int score() {
        if (automaticWin() == false) {
            if (dice[1] != dice[2] && dice[1] != dice[3] && dice[2] == dice[3]) {
                return dice[1];
            } else if (dice[2] != dice[1] && dice[2] != dice[3] && dice[1] == dice[3]) {
                return dice[2];
            } else if (dice[3] != dice[2] && dice[3] != dice[1] && dice[2] == dice[1]) {
                return dice[3];
            } else {
                return 0;
            }
        }
    }


    /*
     */
}

