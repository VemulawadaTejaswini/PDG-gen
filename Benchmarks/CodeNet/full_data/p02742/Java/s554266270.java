
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		
		long h = Long.parseLong(as[0]);
		long w = Long.parseLong(as[1]);
		if(h %2 == 1 && w % 2 == 1) {
			System.out.println(h*w/2 + 1);
		}else {
			System.out.println(h*w/2);
		}

	}

}
