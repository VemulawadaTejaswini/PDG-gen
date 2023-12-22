import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int[] P = new int[N];
        
        for(int i = 0;i < N;i++){
            P[i] = sc.nextInt();
            if(P[i] >= i){
              count++;
        	}
        }
        System.out.print(count);
    }
}