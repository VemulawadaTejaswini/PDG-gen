import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int m = sc.nextInt();
      int[] data = new int[m];
      int count = 0;
      int ans = 0;
      int i = 1;

      for (int t = 0;t<m ;t++ ) {
        data[t] = sc.nextInt();
      }

      for (;i<m ;i++ ) {
        for (int j = i;j<m;j++ ) {
          if(data[j]==j){
            ans++;
          }
        }
        count++;
        if (ans==m-i) {
          System.out.println(count);
          System.exit(0);
        }
      }
      System.out.println("-1");
}
}
