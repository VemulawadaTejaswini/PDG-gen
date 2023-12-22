import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String s = sc.next();
      int lng = s.length();
      char[] c = new char[lng];
      for(int i=0;i<lng;i++){
        c[i] = s.charAt(i);
      }

      long k = Long.parseLong(sc.next());

      String start = s.substring(0,1);
      String end = s.substring(lng-1,lng);

      long ans = 0;

//if(!(start.equals(end))){
///////////////////////////////////////////////
for(int i=1;i<lng;i++){
  if(c[i-1]==c[i]){
    ans++;
    c[i] = '-';
  }
}
ans *= k;
///////////////////////////////////////////////
//}

if(c[lng-1]!='-'){
  ans += k-1;
}

      System.out.println(ans);

    }
}
