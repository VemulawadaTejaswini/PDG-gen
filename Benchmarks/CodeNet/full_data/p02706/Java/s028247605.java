import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];
        int sumA = N;
        for(int i=0;i<M;i++){
            A[i] = sc.nextInt();
            sumA -= A[i];
        }

        if(sumA < 0){
            sumA = -1;
        }

        System.out.println(sumA);

    }

}







