import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "" + scanner.nextInt();
        scanner.close();
        if (s.contains("7")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}