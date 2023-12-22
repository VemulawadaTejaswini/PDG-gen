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
        
        for(int i=2;i<=N;i++){
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
        
        System.out.println(result);
        
    }
}
