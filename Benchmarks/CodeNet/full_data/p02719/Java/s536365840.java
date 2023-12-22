import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a = N;
        for(int i = 0; i < N/K; i++){
            a = a - K;
        }
            int b = Math.abs(K-a);
            if(a < b){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
    }
} 
