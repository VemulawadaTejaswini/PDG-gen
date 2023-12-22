import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int len = s.length();
      
	  int cnt = 0;
      boolean start = false;
      for(int i=0; i<len; i++){
        if("A".equals(s.substring(i,i+1))){
            start = true;
        }
        if (start){
	        cnt += 1;
        }  
        if("Z".equals(s.substring(i,i+1))){
            break;
        }
      }  
      System.out.println(cnt);
    }  
}  