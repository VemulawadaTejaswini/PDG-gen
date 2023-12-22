import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] a = new int[n];
        int odd = 0, even = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            if(a[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        sc.close();

        long ans = 1L;

        if(p == 0){
            if(even==0 && odd < 2){
                ans--;
            }else{
                for(int i=2; i<=odd; i+=2){
                    ans += npm(odd, i);
                }
                //ans *= Math.pow(2, even);
                for(int i=0; i<even; i++) ans *= 2L;        
                if(even != 0) ans /= 2;
                
            }
        }else{
            if(odd == 0){
            }else{
                for(int i=1; i<=odd; i+=2){
                    ans += npm(odd, i);
                }
                //ans *= Math.pow(2L, even);
                for(int i=0; i<even; i++) ans *= 2L;
                if(even != 0) ans /= 2;
            }
            ans--;
        }
        System.out.print(ans);

    }

    public static long npm(int n, int m){
        long ans = 1;
        long d = 1;
        for(int i=n; i>n-m; i--){
            ans *= i;
            while(d <= m && ans % d == 0){
                ans /= d;
                d++;
            }
        }
        return ans;
    }
}