import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int[] t = new int[n];
        for(int i=0; i<n; i++){
            t[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(t);

        int ans = 0;
        int lt = t[0];
        int ln = 0;
        for(int i=0; i<n-1; i++){
            ln++;
            if(ln == c || t[i+1] - lt > k){
                ln = 0;
                lt = t[i+1];
                ans++;
            }
        }
        ans++;
        System.out.print(ans);
	}
}
}
