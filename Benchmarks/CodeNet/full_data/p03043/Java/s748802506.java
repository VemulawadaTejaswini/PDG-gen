import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        double probability = 0;
        for(int i = 1; i <= N; i++){
            double x = Math.max(Math.pow(2, Math.ceil(Math.log(K/i)/Math.log(2)) ), 1.0);
            probability += (double) 1.0 / N / x;
        }
        
        System.out.println(probability);
    }
}
