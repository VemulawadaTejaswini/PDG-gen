import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] SRC = new int[N];
        for(int i = 0; i < N; i++) {
            SRC[i] = Integer.parseInt(sc.next());
        }
        long ans = 0;
        for(int i = 0; i < N; i++) {
            long a = SRC[i];
            long l = 0, r = 0;
            for(int j = i-1; j >= 0; j--) {
                if(SRC[j] < a) break;
                l++;
            }
            for(int j = i+1; j < N; j++) {
                if(SRC[j] < a) break;
                r++;
            }
            ans += (l+1) * (r+1) * a;
        }
        System.out.println(ans);
    }
}