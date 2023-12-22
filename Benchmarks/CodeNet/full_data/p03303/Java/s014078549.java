import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int w = sc.nextInt();
      int i = 0;
      while(i + w<= s.length()){
      	System.out.print(s.substring(i,i+1));
        i+=w;
      }
      System.out.println("");
    }
}