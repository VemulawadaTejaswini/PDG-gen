import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M];
        for (int i = 0; i < N; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int b = sc.nextInt()-1;
                a[b]++;
            }
        }
        int ans = 0;
        for(int c:a){
            if(c == N) ans++;
        }

        System.out.println(ans);
        sc.close();


    }

}
