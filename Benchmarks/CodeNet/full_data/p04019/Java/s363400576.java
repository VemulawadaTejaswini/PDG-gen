import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int x = 0;
      int y = 0;
      for(int i = 0;i < s.length();i++){
      	if(s.substring(i,i+1).equals("N"))y++;
        else if(s.substring(i,i+1).equals("W"))x--;
        else if(s.substring(i,i+1).equals("S"))y--;
        else x++;
      }
      if(x==0&&y==0)System.out.println("Yes");
      else System.out.println("No");
    }
}