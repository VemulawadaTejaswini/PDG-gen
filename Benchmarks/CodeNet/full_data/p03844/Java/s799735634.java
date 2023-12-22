import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        long X, Y;
        String S;

        X = Input.nextLong();
        S = Input.next();
        Y = Input.nextLong();

        if (S.equals("-")) {
            System.out.println(X - Y);
        } else {
            System.out.println(X + Y);
        }

    }

}