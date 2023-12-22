import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        String s = sc.next();
        switch (s) {
            case "Sunny":
                System.out.println("Cloudy");
                break;
            case "Cloudy":
                System.out.println("Rainy");
                break;
            case "Rainy":
                System.out.println("Sunny");
                break;
        }
    }
}

