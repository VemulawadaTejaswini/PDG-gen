import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N=sc.nextInt();
      int[] A = new int[N+1];
      int[] B = new int[N+1];
      int[] AA = new int[N+1];
      int[] BB = new int[N+1];

      int min;
      int sumA=0;
      int sumB=0;
      int aaa=0;

      for(int i=1;i<=N;i++){
        A[i]=sc.nextInt();
        B[i]=sc.nextInt();
      }

    for(int i=1;i<=N;i++){
      min=999999999;
      for(int j=1;j<=N;j++){
        if(B[j]<min){
          min=B[j];
        }
      }
      for(int j=1;j<=N;j++){
        if(B[j]==min){
          BB[i]=B[j];
          AA[i]=A[j];
          B[j]=999999999;
          break;
        }
      }
    }

    for(int i=1;i<=N;i++){
      sumA+=AA[i];
      if(sumA>BB[i]){
        aaa=1;
      }
    }

    if(aaa==1){
        System.out.println("No");
    }
    else{
        System.out.println("Yes");
    }

    }
}
