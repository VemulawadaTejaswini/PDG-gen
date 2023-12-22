import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String s = sc.next();
      String t = sc.next();

      char ss;
      char tt;

      int ans=0;

      for(int i=0;i<3;i++){
        ss = s.charAt(i);
        tt = t.charAt(i);

        if(ss==tt){
          ans++;
        }

      }

      System.out.println(ans);

    }
}
