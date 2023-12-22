import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long MOD = 998244353;
        int n = sc.nextInt();
        int node[] = new int[n];
        for(int i=0;i<n;i++)node[i]=0;
        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            node[d]++;
        }
        if(node[0]!=1){
            System.out.println(0);
            return;
        }
        long ans = 1;
        for(int i=2;i<n;i++){
            ans *= Math.pow(node[i-1],node[i]);
            ans = ans %MOD;
        }
        System.out.println(ans);



    }
}
