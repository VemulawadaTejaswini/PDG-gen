import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        String s = sc.next();
        switch (s) {
            case "Sunny":
                System.out.println("Cloudy");
                return;
            case "Cloudy":
                System.out.println("Rainy");
                return;
            case "Rainy":
                System.out.println("Sunny");
        }
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}