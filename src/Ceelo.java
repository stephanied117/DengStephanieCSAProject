import java.util.Scanner;
public class Ceelo {
    public Ceelo() {
    }
    public void start() {
        Scanner scan = new Scanner(System.in);
        String[] begin = {"   WELCOME", "     to", "     the", "CEE-LO DICE GAME"};
        for (String word : begin) {
            System.out.println(word);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
        System.out.println("{Enter x to play}");
        String rmvMenu = scan.nextLine();
        if (rmvMenu.equals("x")) {

        }
    }
}
