import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());
      String s = sc.next();

      char[] c = new char[n];

      int ans = 0;

      int num = 0;

      boolean aaa = true;

      for(int i=0;i<n;i++){
        c[i] = s.charAt(i);
        if(i!=0 && c[i]==c[i-1]){
          ans ++;
        }
        if(i!=0 && c[i]!=c[i-1]){
          num ++;
        }
        if(i==1 && c[i]==c[i-1]){
          num --;
          aaa = false;
        }
        if(i==n-1 && c[i]==c[i-1] && aaa){
          num --;
        }
      }

      if(num>=k){
        ans += 2*k;
      }
      else{
        ans += 2*num + (k-num);
      }



      System.out.println(ans);


    }
}
