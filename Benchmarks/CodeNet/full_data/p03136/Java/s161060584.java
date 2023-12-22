import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N]; 
        int max = 0;
        int sum = 0;
        
        for(int i = 0; i < N; i++){
            L[i] = sc.nextInt();
        }
        
        for(int i = 0; i < N; i++){
            if(max < L[i]){
                max = L[i];
            }
            sum += L[i];
        }
        
        if(max < sum - max){
                System.out.println("Yes");
        }else{
                System.out.println("No");
        }
    }
}
