import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int NN = N + 1;
        double res = 0;
        
        for(int i = 0; i < N ; i ++){
        double a = 1/N * Math.pow(0.5, NN - i);
        res += a;
        }
        
        System.out.println(res);
    }
}