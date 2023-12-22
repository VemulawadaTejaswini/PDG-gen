import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      while(true){
        if(s.length() <= 4){
        	System.out.println("NO");
          return;
        }
      	if(s.length() >= 6&&s.substring(s.length()-6,s.length()).equals("eraser")){
          if(s.equals("eraser")){
          	System.out.println("YES");
            return;
          }else{
          	s = s.substring(0,s.length()-6);
          }
        }
        else if(s.substring(s.length()-5,s.length()).equals("erase")){
          if(s.equals("erase")){
          	System.out.println("YES");
            return;
          }else{
          	s = s.substring(0,s.length()-5);
          }
        }
        else if(s.length() >= 7&&s.substring(s.length()-7,s.length()).equals("dreamer")){
          if(s.equals("dreamer")){
          	System.out.println("YES");
            return;
          }else{
          	s = s.substring(0,s.length()-7);
          }
        }
        else if(s.substring(s.length()-5,s.length()).equals("dream")){
          if(s.equals("dream")){
          	System.out.println("YES");
            return;
          }else{
          	s = s.substring(0,s.length()-5);
          }
        }
        else{
        	System.out.println("NO");
            return;
        }
      }
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