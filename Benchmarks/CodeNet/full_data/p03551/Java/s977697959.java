import java.util.*;
import java.lang.*;


public class Main {
    static int pow(int a, int b){
        int ans = 1;
        for(int i=0; i<b; i++) ans *= a;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        long cycle = 1900*M+100*(N-M);
        int trial = pow(2, M);
        System.out.println(cycle*trial);
    }
}
