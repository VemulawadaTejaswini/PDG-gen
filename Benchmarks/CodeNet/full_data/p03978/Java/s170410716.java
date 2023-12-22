import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
 
import java.util.*;
public class Main {
	
	int N,cnt,direct;
	String s1,s2;
	String[][] append = new String[][]{{".","."},{".","#"},{"#","."},{"#","#"}};
	HashSet<String> set;
	public void solve(){
		N = nextInt();
		s1 = ".";
		s2 = ".";
		set = new HashSet<String>();
		while(true){
			out.println(s1+"\n"+s2);
			out.flush();
			String res = next();
			
			if(res.equals("end"))break;
			
			if(res.equals("T")){
				cnt = 0;
				if(direct == 0){
					s1 = s1 + append[cnt][0];
					s2 = s2 + append[cnt][1];
				}else{
					s1 = append[cnt][0] + s1;
					s2 = append[cnt][1] + s2;
				}
				cnt++;
			}else{
				set.add(s1 + "\n" + s2);
				if(cnt >= 4){
					cnt = 0;
					direct = direct == 0 ? 1 : 0;
				}
				while(true){
					if(direct == 0){
						String ss1 = s1.substring(0,s1.length() - 1);
						String ss2 = s2.substring(0,s2.length() - 1);
					
						s1 = ss1 + append[cnt][0];
						s2 = ss2 + append[cnt][1];
						
						if(!set.contains(s1 + "\n" + s2))break;
					}else{
						String ss1 = s1.substring(1);
						String ss2 = s2.substring(1);
						
						s1 = append[cnt][0] + ss1;
						s2 = append[cnt][1] + ss2;
						
						if(!set.contains(s1 + "\n" + s2))break;
					}
					cnt++;
				}
			}
		}
	}
 
	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}
 
	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;
 
	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}
 
	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}
 
	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}
 
	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}
 
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}
 
	public int nextInt() {
		return Integer.parseInt(next());
	}
 
	public long nextLong() {
		return Long.parseLong(next());
	}
 
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}