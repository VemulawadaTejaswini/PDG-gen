import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception{
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       char[] line = br.readLine().toCharArray();
	       int[] num = new int[26];
	       for(char c : line){
	    	   if(num[c-'a']+1==1){
	    		   num[c-'a']+=1;
	    	   }else{
	    		   System.out.println("no");
	    		   return;
	    	   }
	       }
	       System.out.println("yes");
	}
}
