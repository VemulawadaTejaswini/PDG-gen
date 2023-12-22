import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(), D = sc.nextInt(), x2000 = sc.nextInt();

        for (int i=0; i<10; i++) {
            x2000 = r * x2000 - D;
            System.out.println(x2000);
        }
    }
}