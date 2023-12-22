import java.util.*;

public class Main{


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int k = sc.nextInt();

        int nCk = factorical(n)/(factorical(n-k)*factorical(k));


        for (int i=1; i<=k; i++){
            int first = factorical(n-k+1)/(factorical(n-k+1-i)*(factorical(i)));
            int second = factorical(k-1)/(factorical(k-i)*factorical(i-1));

            System.out.println(first*second);


        }

//        System.out.println(nCk);


        }

    static int factorical(int x){
        int mod = (int)1e9 + 7;

        int fact = 1;
        if (x==0) return fact;
        else{
            for (int i=x; i>0; i--){
                fact *= i;
            }
        }
        return fact%mod;
    }
}
