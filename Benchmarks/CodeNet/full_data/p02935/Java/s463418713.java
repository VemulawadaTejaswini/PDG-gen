import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, c, k, j;

		int t = Integer.parseInt(br.readLine());    
        StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] ar = new int[t];
     
		for(i=0;i<t;i++)
          ar[i]=Integer.parseInt(st.nextToken());
         double sum=0,max=0;
        for(i=0;i<t;i++)
        {
          sum=ar[i];
          for(k=i+1;k<t;k++)
            sum=(sum+ar[k])/2;
          for(j=i-1;j>=0;j--)
            sum=(sum+ar[j])/2;
          max = Math.max(max,sum);
        }
	out.print(max);
	out.flush();
	out.close();
	
	}
}