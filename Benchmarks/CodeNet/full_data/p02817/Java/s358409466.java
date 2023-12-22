import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S, T;
        S = scan.nextLine();
        T = scan.nextLine();
        System.out.println(T.concat(S));

    }
}