import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt(), t = sc.nextInt();
        System.out.println(Math.max(x - t, 0));
    }
}