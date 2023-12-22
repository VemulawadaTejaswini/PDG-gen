import java.util.*;
public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new  Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int K=sc.nextInt();
        int cA =0;
        int cB =0;
        for(int i=0;i<K;i++){
        if(A%2==1){
        A--;
        }
       cA=A/2;
       A/=2;
       B+=cA;
       i++;
       if(i>=K)break;
       if(B%2==1){
        B--;
        }
       cB=B/2;
       B/=2;
       A+=cB; 
        }
    System.out.println(A+" "+B);
    }
}