import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] s = new String[N];

        for (int i=0;i<N;i++) {
            s[i] = sc.next();
        }

        int ans = 0;
        for (int i=0;i<N-1;i++) {
            for (int j=i+1;j<N;j++) {
                if (isAnagram(s[i], s[j])) ans++;
            }
        }

        System.out.println(ans);
    }

    private static boolean isAnagram(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

//        System.out.println("s1: " + String.valueOf(c1));
//        System.out.println("s2: " + String.valueOf(c2));

        return String.valueOf(c1).equals(String.valueOf(c2));
    }
}
