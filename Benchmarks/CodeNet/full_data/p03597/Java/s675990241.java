import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), a = sc.nextInt();
        System.out.println(n * n - a);
    }
}