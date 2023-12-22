import java.io.*;
import java.util.*;

class Game {
    public static void main(String[] args) throws Exception {
	//try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, c, k;

		String str = Integer.parseInt(br.readLine());    
        
      	int[] count = new int[27];
      	
      for(i=0;i<str.length();i++)
        	count[str.charAt(i)-'a']++;
      int sum=0;
      for(i=0;i<27;i++)
        if(count[i]!=0)
        	sum+=count[i];
      
      out.print(sum);
	
	out.flush();
	out.close();
	//}catch(Exception e){}
	}
}