import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        int sum = 0;
        
        for(int i = 0; i < N; i++){
            L[i] = sc.nextInt();
        }
        Arrays.sort(L);
        
        for(int i = 0; i < N - 2; i++){
            for(int j = i + 1; j < N - 1; j++){
                for(int k = j + 1; k < N; k++){
                    if(L[i] + L[j] > L[k]){
                        sum++;
                    }else{
                        break;
                    }
                }
            }
        }
        
        System.out.println(sum);
    }
}