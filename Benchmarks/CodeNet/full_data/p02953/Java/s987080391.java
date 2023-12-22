import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] hs = br.readLine().split(" ");
		if(n > 1) {
			boolean stop = false;
			long max = Long.parseLong(hs[0]);
			for (int i = 0; i < hs.length -1 && !stop; i++) {
				long c = Long.parseLong(hs[i]);
				long nx = Long.parseLong(hs[i+1]);
				if(c-nx > 1) {
					stop = true;
					System.out.println("No");
				} else if(c-nx == 1){
					if(c - 1 < max) {
						System.out.println("No");
						stop = true;
					} else {
						hs[i] = String.valueOf(c-1);
						c--;
					}
				}
				if(c > max) {
					max = c;
				}
			}
			if(!stop) {
				System.out.println("Yes");
			}
		} else {
			System.out.println("Yes");
		}
		
		br.close();
	}

}
