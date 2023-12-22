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
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) == 'A' && s.charAt(j + 1) == 'B')
                    ans++;
            }
            if (c1 == 'B' && c2 == 'A')
                countAB++;
            else if (c1 == 'B')
                countB++;
            else if (c2 == 'A')
                countA++;
        }

        if (countB + countA + countAB == 0)
            System.out.println(ans);
        else if (countB + countA == 0)
            System.out.println(ans + countAB - 1);
        else if (countAB == 0)
            System.out.println(ans + Math.min(countA, countB));
        else
            System.out.println(ans + countAB + Math.min(countA, countB));

        sc.close();
    }
}