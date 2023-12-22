import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.equals("A")) {
            System.out.println("T");
        }
        else if (input.equals("C")) {
            System.out.println("G");
        }
        else if (input.equals("G")) {
            System.out.println("C");
        }
        else { // T
            System.out.println("A");
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
