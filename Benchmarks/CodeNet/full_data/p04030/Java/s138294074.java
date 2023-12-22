
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		//String[] arg = br.readLine().split(" ");
		//int[] inp = new int[arg.length];
		Solver s = new Solver();
		

		System.out.println(s.solve(br.readLine()));
	}

}

class Solver {

	String solve(String inp) {

		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<inp.length();i++) {
			if(inp.charAt(i)=='B' && sb.length()==0) {
				continue;
			}
			if(inp.charAt(i)=='0'||inp.charAt(i)=='1') {
				sb.append(inp.charAt(i));
			}if(inp.charAt(i)=='B') {
				sb.deleteCharAt(sb.length()-1);
			}
		}
		return sb.toString();
	}

}