import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int K = sc.nextInt();
         int Q = sc.nextInt();
         
         int[] score = new int[N];
         //scoreの箱は得点。最初は全ての箱にKを代入。
         
         for (int i = 0; i < N-1; i++){
             score[i] = K;
         }
         
         int[] round = new int[Q];
         //roundの箱はそのラウンドで誰が正解したか。箱の中身に誰が正解したかを読みこむ。
         
         for (int j = 0; j < Q-1 ; j++){
              round[j] = sc.nextInt();
         }
         
         for (int m = 0; m < Q-1; m++){
             int n = round[m];
             
             for (int o = 0; o < N-1; o++){
                 if (o != n-1){
                   score[o]--;  
                 }
             }
             
        for (int p = 0; p < N-1; p++){
            if (score[p] < 0){
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }  
    }
  }
}