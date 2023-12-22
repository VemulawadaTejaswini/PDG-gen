import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double N = Integer.parseInt(sc.next());
        double K = Double.parseDouble(sc.next());
        double sum = 0;
        if(N < K) {
            for(int i = 1; i <= N; i++) {
                int kijun = 0;
                if(Math.log(K / i) / Math.log(2) == (int)(Math.log(K / i) / Math.log(2))) {
                    kijun = (int)(Math.log(K / i) / Math.log(2));
                }else {
                    kijun = (int)(Math.log(K / i) / Math.log(2)) + 1;
                }
                sum += 1 / (double)N * Math.pow(0.5, kijun);
            }
            System.out.println(sum);
        }else {
            
            for(double i = 1; i < K; i++) {
                int kijun = 0;
                if(Math.log(K / i) / Math.log(2) == (int)(Math.log(K / i) / Math.log(2))) {
                    kijun = (int)(Math.log(K / i) / Math.log(2));
                }else {
                    kijun = (int)(Math.log(K / i) / Math.log(2)) + 1;
                }
                sum += (1 / N) * Math.pow(0.5, kijun);
            }
            
            sum += (1 / N) * (N - K + 1);
            System.out.println(sum);
        }
        
    }
}