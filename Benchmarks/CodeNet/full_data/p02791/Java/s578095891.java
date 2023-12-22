import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        boolean judge = true;
        int counter = 0;
        for(int i = 0; i < N; i++){
            P[i] = sc.nextInt();
        }
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < i; j++){
                if(P[i] > P[j]){
                    judge = false;
                }
            }
            if(judge){
                counter++;
            }
            judge = true;
        }
        
        System.out.println(counter);
    }
}
