import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();
      int idata[] = new int[m];
      String sdata[] = new String[m];
      boolean ac[] = new boolean[10000000];
      int a = 0;
      int w = 0;

      for (int i = 0;i<m ;i++ ) {
        idata[i] = sc.nextInt();
        sdata[i] = sc.next();
      }

      for (int i = 0;i<m ;i++ ) {
        if (ac[idata[i]]==false) {
          if (sdata[i].equals("WA")) {
            w++;
          }else{
            a++;
            ac[idata[i]]=true;
          }
        }
      }
      System.out.println(a+" "+w);

  }
}
