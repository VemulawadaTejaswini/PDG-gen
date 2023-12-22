import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int len = s.length();
      
      String str = "";
      StringBuilder sb = new StringBuilder();
      for(int i=0; i<len; i++){
        if(i%2==0){
	        sb.append(s.substring(i,i+1));
        }
      }  
      System.out.println(sb.toString());
    }  
}  