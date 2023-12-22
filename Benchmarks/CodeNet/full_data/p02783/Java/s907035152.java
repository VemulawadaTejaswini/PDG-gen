import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String parts[] = br.readLine().split(" ");
		
		int H = Integer.parseInt(parts[0]);
		int A = Integer.parseInt(parts[1]);
		
		int a = H%A;
		
		if(a==0) {
			System.out.println(H/A);
		}else {
			System.out.println(H/A+1);
		}
		
	}

}
