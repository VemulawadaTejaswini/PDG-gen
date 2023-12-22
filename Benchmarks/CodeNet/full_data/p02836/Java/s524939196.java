import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int cnt = 0;
      for(int i=0;i<s.length()/2;i++){
        if(s.charAt(i)!=s.charAt(s.length()-1-i))cnt++;
      }
      System.out.println(cnt);
      
    }
    public static int lcm(int x, int y){
      return x*y/gcd(x,y);
    }
    public static int gcd(int x, int y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}
class Pair{
    int a,b;

    Pair(int a, int b){
      this.a = a;
      this.b = b;
    }
}