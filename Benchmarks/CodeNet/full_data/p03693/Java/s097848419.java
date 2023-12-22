import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String r = scan.next();
        String g = scan.next();
        String b = scan.next();
        String cnt;
        
        String rgb;
        int rgb_num;
        
        rgb = r + g + b;
        rgb_num = Integer.parseInt(rgb);
        
        if(rgb_num % 4 == 0)cnt = "YES";
        else cnt = "NO";
            
        System.out.println(cnt);
	  }
}