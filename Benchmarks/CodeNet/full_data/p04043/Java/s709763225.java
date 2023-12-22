import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] read =new String[3];
		read = br.readLine().split(" ");
		int A =  Integer.parseInt(read[0]);
		int B =  Integer.parseInt(read[1]);
		int C =  Integer.parseInt(read[2]);
		if((A == 5) && (B == 7) && (C == 5)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}