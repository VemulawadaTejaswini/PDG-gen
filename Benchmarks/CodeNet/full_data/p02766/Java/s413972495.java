import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 0;
        while(N > 0){
        	N /= K;
        	result++;
        }
        System.out.println(result);
    }
}