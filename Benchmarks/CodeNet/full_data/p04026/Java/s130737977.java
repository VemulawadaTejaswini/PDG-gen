import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
	  static int mod=1000000007;
      public static void main(String[] args) {
    	  Scanner in=new Scanner( new BufferedReader(new InputStreamReader(System.in)))	;
    	  String string=in.next();
    	  int n=string.length();
    	  TreeMap<Character, Integer> map=new TreeMap<Character, Integer>(); 
    	  int l=0,r=0;
    	  long num=0;
    	  for(int i=0;i<n-1;i++)
    	  {
    		 for(int j=i+1;j<n&&j<=i+2;j++)
    		 {
    			 if(string.charAt(j)==string.charAt(i))
    			 {
    				 i++;j++;
    				 System.out.println(i+" "+j);
    				 return ;
    			 }
    		 }
    	  }
    	  System.out.println("-1 -1");
    	  
      }
}
