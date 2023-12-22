import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] H = new int[N];
        int [] DP = new int[N];
        for(int i=0;i<N;i++)H[i] = sc.nextInt();
        DP[0]=0;
        DP[1]=Math.abs(H[1]-H[0]);
        for(int i=2;i<N;i++){
            int n1 = Math.abs(H[i]-H[i-2]);
            int n2 = Math.abs(H[i]-H[i-1]);
            if(DP[i-2]+n1<DP[i-1]+n2) DP[i] = DP[i-2]+n1;
            else DP[i]=DP[i-1]+n2;
        }
        System.out.println(DP[N-1]);
    }
}