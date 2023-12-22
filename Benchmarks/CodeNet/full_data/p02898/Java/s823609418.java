import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());

      int ans = 0;

      int[] h = new int[n];
      for(int i=0;i<n;i++){
        h[i] = Integer.parseInt(sc.next());
        if(h[i]>=k){
          ans++;
        }
      }

      
      System.out.println(ans);

    }
}
