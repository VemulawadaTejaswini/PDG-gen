import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      int n,x, min = 1000;

      n = Integer.parseInt(sc.next());
      x = Integer.parseInt(sc.next());

      int m[] = new int[n];

      for(int i=0; i<n; i++){
        m[i] = Integer.parseInt(sc.next());
        x = x- m[i];
        if(m[i]<min){
          min = m[i];     
        }
      }

      System.out.println(n + x/min);

      
    }
    catch (Exception e) {
      
    }
  }
}