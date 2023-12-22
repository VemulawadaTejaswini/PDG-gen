import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int D = in.nextInt();

            int AB = A + B;
            int CD = C + D;
            System.out.println(AB == CD ? "Balanced" : AB > CD ? "Left" : "Right");
        }
    }
}
