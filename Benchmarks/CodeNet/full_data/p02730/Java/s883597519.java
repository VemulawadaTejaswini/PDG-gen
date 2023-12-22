import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
    	// Solution sol = new Solution();
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine();
    	int N = s.length();
    	if(N%2==0)
    		System.out.println("No");
    	else if(checkPal(s)&&checkPal(s.substring(0,(N-1)/2))&&checkPal(s.substring((N+3)/2-1,N)))
    		System.out.println("Yes");
    	else
    		System.out.println("No");

    }

    public static boolean checkPal(String s){

    	for(int i=0; i<=s.length()/2; i++){
    		if(s.charAt(i)!=s.charAt(s.length()-1-i))
    			return false;
    	}
    	return true;
    }
}