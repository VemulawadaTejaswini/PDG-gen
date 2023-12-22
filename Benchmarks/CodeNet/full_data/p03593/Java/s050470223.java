import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().input().solve().output();
	}
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);
	int H = 0;
	int W = 0;
	String[] matrix = null;
	int[][] matrixCheck = null; 
	HashMap<String,Integer> matrixCheck2 = null;
	boolean ans = true;
	public Main input() throws IOException {
		String[] tmp = br.readLine().split(" ");
		H = Integer.parseInt(tmp[0]);
		W = Integer.parseInt(tmp[0]);
		matrix = new String[H];
		matrixCheck = new int[H][26];
		matrixCheck2 = new HashMap<>();
		for(int i=0; i<H; i++) {
			matrix[i] = br.readLine();
			ans = ans && lineCheck(matrix[i],matrixCheck[i]);
		}
		return this;
	}

	public Main solve() throws IOException {
		int oddCount = 0;
		for(String key: matrixCheck2.keySet()){
			if(matrixCheck2.get(key) % 2 ==1){
				oddCount++;
				if(oddCount>H%2){
					ans=false;
					return this;
				}
			}
		}
		return this;
	}
	
	public Main output() {
		out.println(ans ? "Yes" : "No");
		out.flush();
		return this;
	}
	
	private boolean lineCheck(String s, int[] check) {
		int len = s.length();
		for(int i=0; i<len; i++) {
			check[s.charAt(i)-'a']++;
		}
		int oddCount=0;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<26; i++) {
			if(check[i]%2 == 1){
				oddCount++;
				if(oddCount>W%2){
					return false;
				}
			}
			sb.append((char)('a'+i));
			sb.append(check[i]);
		}
		String key = sb.toString();
		int value = 1;
		if(matrixCheck2.containsKey(key)){
			value = matrixCheck2.get(key)+1;
		}
		matrixCheck2.put(key,value);
		return true;
	}
}