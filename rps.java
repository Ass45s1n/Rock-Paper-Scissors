import java.util.Scanner;
import java.util.Random;
public class rps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String user_turn, comp_turn,cont;
        while (true) {
            int rand = random.nextInt(2);
            System.out.println("Enter r,p or s:");
            user_turn = scanner.nextLine().toLowerCase();
            // 0 = paper    1 = sciccors    else = rock
            if (rand == 0) {
                comp_turn = "p";
            } else if (rand == 1) {
                comp_turn = "s";
            } else {
                comp_turn = "r";
            }
            System.out.println("Computer: " + comp_turn + " User: " + user_turn);
            if (user_turn.equals(comp_turn)) {
                System.out.println("Draw");
            } else if (user_turn.equals("r") && comp_turn.equals("p")) {
                System.out.println("Computer Wins");
            } else if (user_turn.equals("p") && comp_turn.equals("s")) {
                System.out.println("Computer Wins");
            } else if (user_turn.equals("s") && comp_turn.equals("r")) {
                System.out.println("Computer Wins");
            } else {
                System.out.println("User Wins");
            }
            System.out.println("Do you want to continue? Y/N");
            cont = scanner.nextLine().toLowerCase();
            if (cont.equals("n")) {
                break;
            }
        }
        scanner.close();
    }
}
