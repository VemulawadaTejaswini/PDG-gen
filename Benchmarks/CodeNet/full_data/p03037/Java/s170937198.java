import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] ar = new int[N+1];
        for(int i = 0; i<M; i++){
            int l = sc.nextInt()-1;
            int r = sc.nextInt();
            ar[l]++;
            ar[r]--;
        }
        int cnt  = 0;
        if(ar[0] == M) cnt++;
        for(int i = 1; i<N+1; i++){
            ar[i]+=ar[i-1];
            if(ar[i] == M) cnt++;
        }
        System.out.println(cnt);
    }
}