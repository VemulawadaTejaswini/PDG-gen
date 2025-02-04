import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Sn = String.valueOf(N).chars().map(Character::getNumericValue).sum();

        System.out.println(
                N % Sn == 0
                ? "Yes"
                : "No"
        );
    }

}
