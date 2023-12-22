import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int L = s.nextInt();

        System.out.println((double) L * L * L / 27);
        s.close();
    }
}