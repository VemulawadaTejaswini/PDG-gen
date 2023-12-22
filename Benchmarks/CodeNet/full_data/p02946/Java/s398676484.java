import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int k = Integer.parseInt(line[0]);
		int x = Integer.parseInt(line[1]);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<2*k-1; i++){
			sb.append(x-k+1+i);
			sb.append(" ");
		}
		String result = sb.toString();
		System.out.println(result.substring(0, result.length()-1));
	}
}
