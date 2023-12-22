import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int ans = 0;
        char[] c = new char [5]; 
        for (int i = A; i <= B; ++i) {
            c = String.valueOf(i).toCharArray();
            if (c[0] == c[4] && c[1] == c[3]) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}