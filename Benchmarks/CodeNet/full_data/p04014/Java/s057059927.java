import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int result = -1;
        String x = String.valueOf(N);
        int ketaN = x.length();
        String y = String.valueOf(S);
        int ketaS = y.length();
        
        int start = (int)Math.pow(10,ketaS-2);
        if(start<S&&start<N){
            for(int i=start;i<=N;i++){
                int b=i;
                int n = N;
                int sum = 0;
                while(b<n){
                    sum += n%b;
                    n = n/b;
                    if(sum > S){
                        break;
                    }
                }
                sum += n%b;
                if(sum == S){
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);
        
    }
}
