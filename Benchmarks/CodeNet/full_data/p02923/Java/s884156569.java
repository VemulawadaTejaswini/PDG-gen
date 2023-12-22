import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.util.Arrays;

public class Main{
        
    public static void main(String[] args)throws IOException{
	br = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter out = new PrintWriter(System.out);
	int n = nextInt();
	int v[] = new int[n];
        for(int  i = 0; i<n;i++){
	    v[i] = nextInt();
        }
	int ans = 0,r = 0;
	int c = 0;
	for(int i=1;i<n;i++){
	    if(v[i]<=v[i-1]){
		ans++;
            }else{
		r = ans>r?ans:r;
		ans = 0;
	    }
	    
	}
	out.println(r>ans?r:ans);
	out.close();
    }
    
    static BufferedReader br;
    static StringTokenizer st = new StringTokenizer("");
    static String next()throws IOException{
	while(!st.hasMoreTokens()){
	    st = new StringTokenizer(br.readLine());
	}
	return st.nextToken();
    }
    static int nextInt()throws IOException{
	return Integer.parseInt(next());
    }
    static long nextLong()throws IOException{
	return Long.parseLong(next());
    }
}