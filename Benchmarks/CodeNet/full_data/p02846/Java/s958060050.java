import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        long a1 = sc.nextLong();
        long a2 = sc.nextLong();
        long b1 = sc.nextLong();
        long b2 = sc.nextLong();

        if (a1 * t1 + a2 * t2 == b1 * t1 + b2 * t2) {
            System.out.println("infinity");
            System.exit(0);
        }

        int ans = 0;
        long aDist = a1 * t1;
        long bDist = b1 * t1;
        for (int i = 0; true; i++) {
            long a;
            long b;
            int time;
            if (i % 2 == 0) {
                a = a2;
                b = b2;
                time = t2;
            } else {
                a = a1;
                b = b1;
                time = t1;
            }
            long aNewDist = aDist + a * time;
            long bNewDist = bDist + b * time;
            // 逆転
            if ((aDist - bDist > 0 && aNewDist - bNewDist < 0) || (aDist - bDist < 0 && aNewDist - bNewDist > 0)) {
                ans++;
            } else if (aNewDist - bNewDist == 0) {
                ans++;
            } else {
                break;
            }
            aDist = aNewDist;
            bDist = bNewDist;
        }
        System.out.println(ans);

        sc.close();
    }

}
