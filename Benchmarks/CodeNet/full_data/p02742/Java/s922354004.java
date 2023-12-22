
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
		long hw = h*w;
		if(h == 1 || w == 1) {
			System.out.println(1);
		}else if(hw%2 == 1) {
			System.out.println(hw/2 + 1);
		}else {
			System.out.println(hw/2);
		}

	}

}
