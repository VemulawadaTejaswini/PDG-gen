
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nh = br.readLine().split(" ");
		int n = Integer.parseInt(nh[1]);
		int h = Integer.parseInt(nh[0]);
		nh = br.readLine().split(" ");
		int[] a = new int[n];
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			sum += Integer.parseInt(nh[i]);
		}
		if(sum >= h) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
