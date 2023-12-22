import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int n = Integer.parseInt(br.readLine());
			int k= Integer.parseInt(br.readLine());
			String[] tmp = br.readLine().split(" ");
			int distance = 0;
			for(String t : tmp) {
				int x = Integer.parseInt(t);
				if(k - x < x) {
					distance += (k-x)*2;
				}else {
					distance += x*2;
				}
			}
			System.out.println(distance);
		}
	}
}