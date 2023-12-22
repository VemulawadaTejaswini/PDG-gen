import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] a = new int[n];
      int cnt = 1;
      a[0] = Integer.parseInt(sc.next());
      for(int i=1;i<n;i++){
        a[i] = Integer.parseInt(sc.next());
        if(a[i-1]<a[i] || a[i-1]>a[i]){
          cnt++;
        }
      }
      System.out.println(cnt);

    }
}
