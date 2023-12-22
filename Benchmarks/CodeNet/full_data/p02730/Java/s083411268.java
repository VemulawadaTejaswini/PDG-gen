import java.util.*; 
import java.io.*;

class Main {

  public static String StringPeriods(String str) {
    boolean flag = false;
    String ans = "";
    for(int i=0;i<str.length();i++){
      String temp = str;
      String substr = str.substring(0,i);
      temp = temp.replaceAll(substr, "");
      if(temp.equals("")) {
    	  flag = true;
    	  ans = substr;
    	  break;
      }
    }
    if(flag) {
    	str = ans;
    }else {
    	str = "-1";
    }
    // code goes here  
    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner sc = new Scanner(System.in);
    String S= sc.next();
    boolean flag = true;
    char[] c = S.toCharArray();
    int N=c.length;
    for(int i=0;i<N;i++) {
    	if(c[i]!=c[N-i-1]) {
    		flag = false;
    	}
    }
    c = S.substring(0,(S.length()-1)/2).toCharArray();
    N=c.length;
    for(int i=0;i<N;i++) {
    	if(c[i]!=c[N-i-1]) {
    		flag = false;
    	}
    }
    c = S.substring((S.length()+3-1)/2).toCharArray();
    N=c.length;
    for(int i=0;i<N;i++) {
    	if(c[i]!=c[N-i-1]) {
    		flag = false;
    	}
    }
   
    if(flag) {
    	System.out.println("Yes");
    	
    }else {
    	System.out.println("No");
    }
  }

}