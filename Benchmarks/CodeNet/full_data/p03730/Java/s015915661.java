import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mod = a % b;

        int tmp = mod;
        while (tmp != 0) {
            if (tmp == c) {
                println("YES");
                return;
            }
            tmp = (tmp + mod) % b;
        }

        println("NO");
    }

    public void print(Object o) {
        System.out.print(o);
    }

    public void println(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
