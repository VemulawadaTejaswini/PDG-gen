import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int L = s.nextInt();
        double V = (L / 3) * (L / 3) * (L / 3);

        System.out.println(V);
        s.close();
    }
}