import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main{
        
    public static void main(String[] args)throws IOException{
	br = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter out = new PrintWriter(System.out);
	String s = next();
	String a = next();
	int ans = 0;
	for(int i = 0 ; i<3;i++){
	    if(s.charAt(i)==a.charAt(i)){
		ans++;
	    }
	}
	out.println(ans);
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