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
	    String str1=reader.readLine();
	    String s1[]=str1.split(" ");

	    String o=s1[0];
	    String e=reader.readLine();

	    char[] c1=o.toCharArray();
	    char[] c2=e.toCharArray();

	    StringBuilder sb=new StringBuilder();

	 

	    for(int i=0;i<c1.length;i++){
		    sb.append(c1[i]);
		    sb.append(c2[i]);
	    }

	    System.out.println(sb);
		
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
