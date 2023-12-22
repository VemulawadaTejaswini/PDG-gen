
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int res = 1;
		for(int i=1;i<N;i++){
			char ch = str.charAt(i);
			char prev = str.charAt(i-1);
			
			if (ch != prev){
				res++;
			}
		}
		System.out.println(res);
	}
}