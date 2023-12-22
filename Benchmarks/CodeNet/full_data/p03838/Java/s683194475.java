import java.util.*;
import java.io.*;
public class Main{

	public static void main(String[] args) throws IOException {
		try(BufferedReader kb = new BufferedReader(new InputStreamReader(System.in))){
			for (String in = kb.readLine() ; in != null; in = kb.readLine()) {
				StringTokenizer st = new StringTokenizer(in);
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				System.out.println(solve(x,y));
			}
		}
	}

	private static int solve(int x, int y) {
		if(Math.abs(x) == Math.abs(y)){
			return 1;
		}
		else if(x >= 0 && y >= 0){
			if(x < y) return y-x;
			else return x-y+1;
		}
		else if(x < 0 && y < 0){
			if(x > y) return (y*-1)+x+2;
			else return (x*-1)+y;
		}
		else if (y==0&&x<y){
			return Math.abs(x);
		}
		else if (x==0){
			if(y>x)
			return y;
			else
				return Math.abs(y)+1;
		}
		else if(Math.abs(x) > Math.abs(y) && x<y){
			return Math.abs(x)-y+1;
		}
		else if(x < y){
			return y - x*-1  + 1;
		}
		else 
			return x - y*-1 + 1;

	}
}
