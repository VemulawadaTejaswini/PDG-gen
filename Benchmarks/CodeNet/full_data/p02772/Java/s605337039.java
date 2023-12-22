import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static BufferedReader br;
	
	public static void main(String[] args) throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(isApprove()) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
	
		br.close();

	}
	
	private static boolean isApprove() throws IOException {
		boolean flg=true;
		String line[] = br.readLine().split(" ");
		
		for(int i=0;i<line.length;i++) {
			int num = Integer.parseInt(line[i]);
			if(num%2==0 && (num%3!=0 && num%5!=0)) {
				flg=false;
			}
		}
		return flg;
	}
}
