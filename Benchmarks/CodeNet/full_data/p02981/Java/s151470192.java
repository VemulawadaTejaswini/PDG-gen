import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String in[] = new String[3];
		int in_num[] = new int [3];
		try {
			line = br.readLine();
			in = line.split(" ");
			for(int i = 0; i < in.length; i++) {
				in_num[i] = Integer.parseInt(in[i]);
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		int fee = in_num[1] * in_num[0];
		if(fee > in_num[2]) {
			fee = in_num[2];
		}
		
		System.out.println(fee);
	}
} 