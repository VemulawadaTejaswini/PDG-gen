import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        int ans = 0;
        int countA = 0;
        int countB = 0;
        int countAB = 0;

        for (int i = 0; i < n; i++) {
            s = sc.next();
            char c1 = s.charAt(0);
            char c2 = s.charAt(s.length() - 1);
            if (s.contains("AB"))
                ans++;
            if (c1 == 'B')
                countB++;
            if (c2 == 'A')
                countA++;
            if (c1 == 'B' && c2 == 'A')
                countAB++;
        }

        if (countA == countB && countB == countAB && countA > 0)
            System.out.println(ans + countAB - 1);
        else
            System.out.println(ans + Math.min(countA, countB));

        sc.close();
    }
}