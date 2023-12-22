import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        int junni = 1;
        int bjunni = 1;
        int noCnt = 0;

        for (int i = 1; i < n + 1; i++) {
            String si = String.valueOf(s.charAt(i - 1));
            junni = i - noCnt;
            if (junni > a + b) {
                System.out.println("No");
                continue;
            }
            if ("a".equals(si)) {
                System.out.println("Yes");
                continue;
            }
            if ("b".equals(si) && bjunni <= b) {
                System.out.println("Yes");
                bjunni++;
                continue;
            }
            System.out.println("No");
            noCnt++;
        }

        sc.close();
    }
}