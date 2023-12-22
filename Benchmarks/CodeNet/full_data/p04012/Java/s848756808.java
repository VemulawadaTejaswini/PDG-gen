import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String w = sc.next();
    int istack;
    int alps[] = new int[26];
    boolean ans=true;
    
    Arrays.fill(alps,0);
    
    for(int i = 0;i < w.length();i++){
    	istack = (int)w.charAt(i) - 97;
      	alps[istack]++;
    }
    
    for(int i = 0;i < 26 && ans; i++){
    	if(alps[i] % 2 != 0) ans = false;
    }
    
    if(ans) System.out.println("Yes");
   	else System.out.println("No");
  }
}
