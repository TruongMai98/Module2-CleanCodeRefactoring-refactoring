import java.util.Scanner;

public class TennisGameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name player one");
        String namePlayerOne = scanner.nextLine();

        System.out.println("name player two");
        String namePlayerTwo = scanner.nextLine();

        System.out.println("score player one");
        int scorePlayerOne = scanner.nextInt();

        System.out.println("score player two");
        int scorePlayerTwo = scanner.nextInt();

        System.out.println(TennisGame.getScore(namePlayerOne, namePlayerTwo,
                scorePlayerOne, scorePlayerTwo));

    }
}
