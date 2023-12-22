import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int num = 1;
        
        for(int i = 0; i < N; i++){
            num = num < K ? num *= 2 : num += K;
        }
        
        System.out.println(num);
    }
}
