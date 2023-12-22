import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int D = scan.nextInt();
        int x = scan.nextInt();
        for (int i = 0; i < 10; i++) {
            x =  r * x - D;
            System.out.println(x);
        }
    }
}
