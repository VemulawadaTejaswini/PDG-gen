import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
  		String s = sc.next();
  		String t = sc.next();
  		int c=0;
  		for(int i=0;i<s.length();i++){
  			for(int j=i;j<t.length();j++){
  				if(s.charAt(i) == t.charAt(j))
  					c++;
  				break;
  			}
  		}
  		System.out.print(c);
    }
}