import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] p = new int[n];

      for(int i=0;i<n;i++){
        p[i] = Integer.parseInt(sc.next());
      }

      int[] aaa = new int[n];

      int ans = 0;

      for(int i=0;i<n-1;i++){
        for(int j=1;j<n;j++){
          for(int k=i;k<=j;k++){
            aaa[k]=p[k];
          }
          Arrays.sort(aaa);
          ans += aaa[n-2];
          aaa = new int[n];
        }
      }
      System.out.println(ans);

    }
}
