import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int[] vdata = new int[n];
      int[] cdata = new int[n];

      for (int i = 0;i<n;i++ ) {
         vdata[i] = sc.nextInt();
      }
      for (int i = 0;i<n;i++ ) {
         cdata[i] = sc.nextInt();
      }
      System.out.println(Resale(vdata,cdata,n));
    }


      public static int Resale(int[] vdata,int[] cdata,int n){
        int sum = 0;
        for (int i = 0;i<n;i++ ) {
           if (vdata[i]-cdata[i]>0) {
              sum += vdata[i]-cdata[i];
           }
        }
        return sum;
      }
    }
