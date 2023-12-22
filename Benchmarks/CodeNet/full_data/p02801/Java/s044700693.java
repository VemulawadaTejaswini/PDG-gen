import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String c = sc.next();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char result = alphabet.charAt(alphabet.indexOf(c) + 1);

        System.out.println(result);

        sc.close();
    }
}
