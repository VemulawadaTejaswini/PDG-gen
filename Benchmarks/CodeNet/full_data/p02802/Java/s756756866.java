import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] OPT = new int[N+1];
        int [] check = new int[N+1];
        int AC_sum = 0;
        int WA_sum = 0;
        for(int i=0;i<=N;i++){
            OPT[i]=0;
            check[i]=0;
        }
        for(int i=0;i<M;i++){
            int p = sc.nextInt();
            String s = sc.next();
            if(s.charAt(0)=='A'&&OPT[p]==0) OPT[p]=1;
            else if(s.charAt(0)=='W'&& OPT[p]==0) check[p]++;
        }
        for(int i=1;i<=N;i++){
            if(OPT[i]==1){
                WA_sum+=check[i];
                AC_sum++;
            }
        }
        System.out.print(AC_sum+" "+WA_sum);
    }
}