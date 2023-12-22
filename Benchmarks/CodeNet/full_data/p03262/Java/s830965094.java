import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int x = sc.nextInt();
      int data[] = new int[n];
      int data2[] = new int[n];

      for (int i  = 0;i<n ;i++ ) {
        data[i] = sc.nextInt();
      }

      for (int i  = 0;i<n ;i++ ) {
        data2[i] = Math.abs(data[i]-x);
      }

      System.out.println(gcd(data2,n));

  }

    static int gcd(int[] data2,int n){
      Arrays.sort(data2);
      int ans = data2[0];
      for (int i = 0;i<n ;i++ ) {
        if (ans<data2[i]) {
          int temp = ans;
          ans = data2[i];
          data2[i] = temp;
        }
        while(data2[i]>0){
          int r = ans%data2[i];
          ans = data2[i];
          data2[i] = r;
        }
       }
       return ans;
      }

    }
