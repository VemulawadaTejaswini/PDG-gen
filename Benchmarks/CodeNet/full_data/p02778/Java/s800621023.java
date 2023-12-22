import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            System.out.print("x");
        }
        System.out.println();
    }
}