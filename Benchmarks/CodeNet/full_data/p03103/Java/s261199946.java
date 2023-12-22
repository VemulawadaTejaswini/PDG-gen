import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A_array = new int[N];
        int[] B_array = new int[N];
        
        for(int i = 0; i < N; i++){
            A_array[i] = sc.nextInt();
            B_array[i] = sc.nextInt();
        }
        
        //金額順にソート　嫌な予感しかしない(タイムアウト的な意味で)
        boolean flg = true;
        if(N > 1){
            while(flg){
                for(int i = 0; i < N-1; i++){
                    flg = false;
                    if(A_array[i+1] < A_array[i]){
                        int tmp = A_array[i];
                        A_array[i] = A_array[i+1];
                        A_array[i+1] = tmp;
                        
                        int tmpB = B_array[i];
                        B_array[i] = B_array[i+1];
                        B_array[i+1] = tmpB;
                        
                        flg = true;
                    }
                }
            }
        }
        
        //安い順に買う
        int num = 0;
        long total = 0;
        label:for(int i = 0; i < N; i++){
            for(int j = 0; j < B_array[i]; j++){
                num++;
                total += A_array[i];
                if(num >= M){
                    break label;
                }
            }
        }
        
        System.out.println(total);
        
    }
}
