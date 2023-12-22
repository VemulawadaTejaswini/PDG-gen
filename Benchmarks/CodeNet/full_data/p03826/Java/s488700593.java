import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
//            while (true)// MAKE SURE TO REMOVE THIS
                solve(in);
        }
    }

    private static void solve(Scanner in) {
        int a = in.nextInt() * in.nextInt();
        int c = in.nextInt() * in.nextInt();
        System.out.println(a > c ? a : c);
    }
}