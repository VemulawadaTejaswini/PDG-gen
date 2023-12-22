import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] h= new long[n];
      long[] buff= new long[n];
      boolean f=true;
      for (int i=0; i<n; i++){
      	h[i]=sc.nextLong();
        if (i>0 && f) {
          long diff = h[i-1]-h[i];
          buff[i]+=diff;
          if (h[i]<h[i-1]) {
            if (Math.abs(diff)>1) f=false;
            else {
              buff[i-1]++;
              if (buff[i-1]>0) f=false;
            }
          }
        }
      }
      if (f) System.out.println("Yes");
      else System.out.println("No");
    }
}