import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N=sc.nextInt();

      int[] A = new int[N+1];
      int[] B = new int[N];

      for(int i=0;i<N+1;i++){
        A[i]=sc.nextInt();
      }
      for(int i=0;i<N;i++){
        B[i]=sc.nextInt();
      }

      int cnt=0;
      int bbb;

      for(int i=0;i<N;i++){
        bbb=B[i];
        for(int j=0;j<bbb;j++){
        if(A[i]!=0){
          A[i]--;
          B[i]--;
          cnt++;
        }
        else if(A[i]==0 && A[i+1]!=0){
          A[i+1]--;
          B[i]--;
          cnt++;
        }
      }
    }

      System.out.println(cnt);


    }
}
