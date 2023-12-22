import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int syoukin = syoukin(n) + syoukin(i);
        if (n == 1 && i == 1) syoukin += 400000;

        System.out.println(syoukin);
    }

    static int syoukin(int rank) {
        switch (rank) {
            case 3:
                return 100000;
            case 2:
                return 200000;
            case 1:
                return 300000;
            default:
                return 0;
        }
    }
}
