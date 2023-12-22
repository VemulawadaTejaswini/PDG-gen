import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Y = sc.nextInt();

        int x = 0;
        int y = 0;
        int z = 0;
        boolean flg = false;
        
        Loop:
        for (x = 0; x <= N; x++) {
            for (y = 0; y <= N; y++) {
                for (z = 0; z <= N; z++) {
                    int total = 10000 * x + 5000 * y + 1000 * z;
                    if (total == Y) {
                        flg = true;
                        break Loop;
                    }
                }
            }
        }

        if (flg) {
            System.out.println(x + " " + y + " " + z);
        } else {
            System.out.println("-1 -1 -1");
        }
        
    }
}