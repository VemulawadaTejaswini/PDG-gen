import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q  = sc.nextInt();
        long[] a = new long[q];
        long[] b = new long[q];
        for(int i=0; i<q; i++){
            long tmpa = sc.nextLong();
            long tmpb = sc.nextLong();
            if(tmpa > tmpb){
                a[i] = tmpb;
                b[i] = tmpa;
            }else{
                a[i] = tmpa;
                b[i] = tmpb;
            }
        }

        for(int i=0; i<q; i++){
            long ans = 0;
            ans += (a[i]-1) * 2;

            int count = 0;
            long score = a[i]*b[i];
            for(int j=1; j<b[i]; j++){
                if((a[i]+j)*(a[i]+j) < score){
                    count++;
                }else{
                    break;
                }
            }
            ans += count * 2;
            if((a[i] + count) * (a[i]+count + 1) < score) ans++;
            System.out.println(ans);
        }

    }
}