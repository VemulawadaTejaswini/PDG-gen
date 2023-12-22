import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int maxa = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if(a[i] > maxa){
                maxa = a[i];
            }
        }
        sc.close();
        
        int ans = 0;
        Arrays.sort(b);

        for(int i=0; i<n; i++){
            if(b[n-i-1] > maxa && h > 0){
                h -= b[n-i-1];
                ans++;
            }else{
                break;
            }
        }

        if(h > 0){
            ans += h / maxa;
            if(h%maxa != 0){
                ans++;
            }
        }
        
        System.out.print(ans);
	}
}