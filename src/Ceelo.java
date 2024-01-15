import java.util.Scanner;
public class Ceelo {
    public Ceelo() {
    }
    public void start() {
        screen();
    }
    private void blurbSpitter(String blurb, int time) {
        for (int i = 0; i < blurb.length(); i++) {
            ConsoleUtility.clearScreen();
            System.out.println(blurb.substring(0, i));
            try {
                Thread.sleep(time);
            } catch (Exception e) {

            }
        }
    }
    public void screen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        String[] begin = {"    WELCOME", "      to", "      the", "CEE-LO DICE GAME"};
        for (String word : begin) {
            System.out.println(word);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
        System.out.println();
        System.out.println("{Enter x to play}");
        String rmvMenu = scan.nextLine();
        if (rmvMenu.equals("x")) {
            ConsoleUtility.clearScreen();
            objective();
        }
    }
    public void objective() {
        Scanner scan = new Scanner(System.in);
        String objective = "testing 123 yayyy"; //message to be implemented
        blurbSpitter(objective, 100);
        System.out.println();
        System.out.println("{Enter k when done}");
        String rmvMenu = scan.nextLine();
        if (rmvMenu.equals("k")) {
            ConsoleUtility.clearScreen();
            setUp();
        }
    }
    public void setUp() {
        Scanner scan = new Scanner(System.in);
        String banker = "G'day to y'all...I am BOB The Banker!\nI see you three little lads want to challenge me. ";
        blurbSpitter(banker, 75);

        String message = "Player 1, what's your name? ";
        blurbSpitter(message, 75);
        String name = scan.nextLine();
        Player player1 = new Player(name);
        message = "It's " + name + ", sir.";
        blurbSpitter(message, 75);
        banker = "Nice to meet you, " + name + ". \nHow about Player 2? ";
        blurbSpitter(banker, 75);
        name = scan.nextLine();
        Player player2 = new Player(name);
        message = "I am " + name + ". ";
        blurbSpitter(message, 75);
        banker = "Good to know, " + name + ". \nAnd lastly, Player 3? ";
        blurbSpitter(banker, 75);
        name = scan.nextLine();
        Player player3 = new Player(name);
        message = "My name is " + name + ". ";
        blurbSpitter(message, 75);
        banker = "So it's " + name + "... ";
        blurbSpitter(banker, 75);
    }
}
