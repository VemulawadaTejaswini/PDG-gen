import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char c = 'C';

        String answer = "AB" + String.valueOf(new Character((char) (c + (int)Math.floor(n / 1000.0))));

        System.out.println(answer);
    }

}
