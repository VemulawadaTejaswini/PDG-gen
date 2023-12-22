import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] h = new int[n];
      for(int i=0;i<n;i++){
        h[i] = Integer.parseInt(sc.next());
      }

      int ans = 1;
      int max = h[0];

      for(int i=1;i<n;i++){
        if(h[i-1]<=h[i] && max<=h[i]){
          ans++;
          max = h[i];
        }
      }


      System.out.println(ans);

    }
}
