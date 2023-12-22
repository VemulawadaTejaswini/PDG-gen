import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int []result = new int[N];
        
        for (int i = 0; i < M; i++){
            int key = sc.nextInt();
            int value = sc.nextInt();
            
            if ((result[key-1] != 0 && result[key-1] != value) || (N >= 2 && key == 1 && value == 0)){
                System.out.println(-1);
                return;
            }
            result[key-1] = value; 
        }
            
        if (N >= 2 && result[0] == 0){
            result[0] = 1;
        }
        
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        } 
        
    }
}
