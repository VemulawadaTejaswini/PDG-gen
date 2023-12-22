import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
	char key[] = {'k','e','y','e','n','c','e'};
    int key_count = 0;
    int el = 0;
    boolean con = true;
    
    for(int i = 0;i < s.length() && con; i++){
    	if(s.charAt(i) == key[key_count]) {
          key_count++;
          if(key_count == 7) con = false;
          if(el == 1) el = 2;
        }
      	else if(el == 0) el = 1;
      	else if(el == 1){}
      	else con = false;
    }
     	
    if(key_count == 7) System.out.println("YES");
  	else System.out.println("NO");
  }
}
