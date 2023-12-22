import java.util.*;

class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int K= sc.nextInt();
        int result = 0;
        if(K!=1){
            result = N-K;
        }
        System.out.println(result);
    }
}

