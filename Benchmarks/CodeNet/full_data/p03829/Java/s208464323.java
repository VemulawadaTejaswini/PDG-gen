import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    String str=reader.readLine();
	    String s1[]=str.split(" ");

	    int n=Integer.parseInt(s1[0]);
	    int a=Integer.parseInt(s1[1]);
	    int b=Integer.parseInt(s1[2]);
	    int x[]=new int[n];

	    int result=0;
	    
	    String str2=reader.readLine();
	    String s2[]=str2.split(" ");
	    
	    for(int i=0;i<n;i++){
		x[i]=Integer.parseInt(s2[i]);
	    }

	    for(int i=1;i<n-1;i++){
		int xa=a*(x[i]-x[i-1]);
	        result+=Math.max(xa,b);		
	    }

	    System.out.println(result);
	    
	    reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int gcd (int a, int b){
	return b>0?gcd(b,a%b):a;
    }
    static int lcm (int a, int b) {
	return a*b/gcd(a,b);
    }
}
