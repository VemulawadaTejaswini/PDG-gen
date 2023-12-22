import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
      //入力
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] A = new int[n];
      //System.out.println(n);
      for(int i=0;i<n;i++) {
        A[i] = sc.nextInt();
      }
      //for(int i=0;i<n;i++) {
        //System.out.println(A[i]);
      //}
      
      //計算
      int[] B = new int[n];
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          if(A[j]==i+1) {
            B[i]=j+1;
          }
        }
      }
      
      //出力
      for(int i=0;i<n;i++) {
        System.out.println(B[i]);
      }
      
    }
      
}

