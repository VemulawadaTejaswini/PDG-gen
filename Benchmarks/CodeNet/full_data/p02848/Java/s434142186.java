import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
   	int n = scn.nextInt();
    String s = scn.next();
    int asc ;
    char ch[] = new char[s.length()];
    
    for(int i=0; i<s.length();i++){
    	asc = (int)s.charAt(i) + n;
      	if(asc > 90) asc -=26;
      	ch[i] = (char)asc;
    }
     for(int i=0; i<s.length();i++){
    	System.out.print(ch[i]);
    }
  }
}
