import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());
      String s = sc.next();

      char[] c = new char[n];

      int ans = 0;

      int numRL = 0;

      for(int i=0;i<n;i++){
        c[i] = s.charAt(i);
        if(i!=0 && c[i]==c[i-1]){
          ans++;
        }
        if(i!=0 && c[i-1]=='R' && c[i]=='L' ){
          numRL++;
        }
      }

      if(numRL>k){
        ans += 2*k;
      }
      else{
        ans = n -1;
        if(c[0]=='L' && c[0]=='R'){
          ans--;
        }
      }


      System.out.println(ans);


    }
}
