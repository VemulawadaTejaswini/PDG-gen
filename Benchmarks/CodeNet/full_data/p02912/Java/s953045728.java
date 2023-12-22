import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //品数
        int M = sc.nextInt(); // 商品券の枚数
        
        long[] prices = new long[N];
        
        for(int i=0; i<N;i++) {
            prices[i] = sc.nextLong();
        }
        
        Arrays.sort(prices);
        
        for(int i=0; i<M;i++) {
            prices[N-1] /= 2;
            Arrays.sort(prices);
        }
        
        System.out.println(Arrays.stream(prices).sum());
    }

}
