import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int n[] = new int[9];
        for (int i = 0; i < 9; i++) {
            n[i] = sc.nextInt();
        }

        if (!check(n[0] - n[1], n[3] - n[4], n[6] - n[7])
            || !check(n[1] - n[2], n[4] - n[5], n[7] - n[8])
            || !check(n[0] - n[3], n[1] - n[4], n[2] - n[5])
            || !check(n[3] - n[6], n[4] - n[7], n[5] - n[8])) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }

    private boolean check(int sa1, int sa2, int sa3) {
        return (sa1 == sa2) && (sa2 == sa3) && (sa3 == sa1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
