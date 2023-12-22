import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int x = 1000000007;

        if(Math.abs(N - M)>1){
            System.out.println(0);
            return;
        }
        int y;
        if(N>=M){
            y = N;
        }
        else{
            y = M;
        }
        long k = 1;
        for(int i=1; i<=y; i++){
            k = k * i;
            k = k % x;
        }
        if(N!=M){
            System.out.println((k / y * k ) % x);
        }
        else{
            System.out.println((2 * k * k) % x);
        }
    }
}