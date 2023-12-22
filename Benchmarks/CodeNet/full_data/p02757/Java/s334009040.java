import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        String str = sc.next();
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = str.charAt(i) - '0';
        }

        int[] u = new int[n+1];
        int[] modCount = new int[p];
        int ten = 1;

        for (int i = n-1 ; i >= 0; i--) {
            u[i] = (u[i+1] + s[i]*ten)%p;
            ten = (ten*10)%p;
        }

        for(int i = 0 ; i <= n ; i++){
            modCount[u[i]]++;
        }

        long ans = 0;
        if(p == 2 || p == 5){
            for(int i = n-1 ; i >= 0 ; i--){
                if((s[i]%p) == 0){
                    ans += i+1;
                }
            }
        }else{
            for(int i = 0 ; i < p ; i++){
                ans += modCount[i]*(modCount[i]-1)/2;
            }
        }
        System.out.println(ans);
    }
}
