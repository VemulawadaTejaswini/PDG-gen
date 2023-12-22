import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    
    String s = sn.next();
    int l = s.length();
    
    int cnt = 0;
    
    String first = s.substring(0, (l - 1) / 2);
    String last = s.substring(((l + 3) / 2) - 1, l);

    if(first.equals(last)) {
    	cnt++;
    }
    
    int first_l = first.length();
    String f_first_tmp = first.substring(0, (first_l - 1) / 2);
    String f_last_tmp = first.substring(((first_l + 3) / 2) - 1, first_l);
    if(f_first_tmp.equals(f_last_tmp)) {
    	cnt++;
    }  	
    
    int last_l = last.length();
    String l_first_tmp = last.substring(0, (last_l - 1) / 2);
    String l_last_tmp = last.substring(((last_l + 3) / 2) - 1, last_l);
    if(l_first_tmp.equals(l_last_tmp)) {
    	cnt++;
    }
    
    if(cnt == 3) {
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }
  }
}