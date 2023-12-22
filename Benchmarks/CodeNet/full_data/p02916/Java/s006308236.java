import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int[] adata = new int[n];
      int[] bdata = new int[n];
      int[] cdata = new int[n-1];
      int sum = 0;

      for (int i =0 ;i<n ;i++ ) {
        adata[i] = sc.nextInt();
      }
      for (int i =0 ;i<n ;i++ ) {
        bdata[i] = sc.nextInt();
      }
      for (int i =0 ;i<n-1 ;i++ ) {
        cdata[i] = sc.nextInt();
      }

      for (int i =0 ;i<n ;i++ ) {
        sum = sum + bdata[i];
      }

      if (n>3) {
        for (int i =0 ;i<n-1 ;i++ ) {
          if (adata[i]==adata[i+1]-1) {
            sum = sum + cdata[i+1];
          }
        }
      }else if(n==2){
        for (int i =0 ;i<n-1 ;i++ ) {
          if (adata[i]==adata[i+1]-1) {
            sum = sum + cdata[i];
          }
        }
      }else{
        for (int i =0 ;i<n-1 ;i++ ) {
          if (adata[i]==adata[i+1]-1) {
            sum = sum + cdata[i-1];
          }
        }
      }


      System.out.println(sum);
}
}
