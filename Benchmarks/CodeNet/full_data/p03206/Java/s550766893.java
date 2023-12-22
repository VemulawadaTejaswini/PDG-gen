import java.util.Scanner;

public class ChrismasEve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("input a number: ");
        int d = sc.nextInt();

        String result = "Chrismas";
        for (int i = 24; i >= d; i--) {
            result += " Eve";
        }
        System.out.println(result);
    }
}