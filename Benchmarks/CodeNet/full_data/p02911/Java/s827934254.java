import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next()); // 参加者
    int K = Integer.parseInt(sc.next()); // ポイント
    int Q = Integer.parseInt(sc.next()); // 正解数
    int[] A = new int[Q]; // 問題
    for (int i=0; i < Q; i++) {
        A[i] = Integer.parseInt(sc.next()) -1; 
    }
    int[] B = new int[N]; // 持ち点数
    for (int i=0; i < N; i++) {
        B[i] = K;
    }

    for (int i=0; i < Q; i++) { // 問題数のLoop
        for(int j=0; j < N; j++) { // 各自の持ち点ｎLoop
            if(A[i] != j){
                B[j]--;
            }
        }
    }
    for (int i=0; i < N; i++) {
        if(B[i]>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
  }
}

