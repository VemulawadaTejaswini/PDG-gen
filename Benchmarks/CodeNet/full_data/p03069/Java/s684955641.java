import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args)throws IOException{
    //BufferedReader br = new BufferedReader(System.in);
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    
    int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		
		int b_cnt=0, w_cnt=0, f=0;
		for(int i=0; i<n; i++){
			if(s[i]=='#')
				f=1;
			
			if(s[i]=='.')
				w_cnt++;
			else if(s[i]=='#' && f==1)
				b_cnt++;
		}
    
    out.flush();
  }
}