import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args)throws IOException{
    //BufferedReader br = new BufferedReader(System.in);
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    
    int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int b=0, w=0;
		
		for(int i=0; i<n; i++)
			if(s[i]=='.')
				w++;
		
		int min = w;
		for(int i=0; i<n; i++) {
			if(s[i]=='#')
				b++;
			else
				w--;
 
			min = Math.min(min, w+b);
		}
		System.out.println(min);
    
    out.flush();
  }
}