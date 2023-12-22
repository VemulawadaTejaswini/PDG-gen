import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] s = bf.readLine().split(" ");
		int H = Integer.parseInt(s[0]);int W = Integer.parseInt(s[1]);
		int A = Integer.parseInt(s[2]);int B = Integer.parseInt(s[3]);
		bf.close();
		for(int i = 0;i < H;i++) {
			for(int j = 0;j < W;j++) {
				if((i<B)^(j<A)) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			System.out.print("\n");
		}
	}
}