import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int i = 0;
    int ans = 0;
    for(i=0;i<s.length()/2;i++){
      if(s.charAt(i) != s.charAt(s.length()-i-1))ans++;
    }
    System.out.println(ans);
  }
}
