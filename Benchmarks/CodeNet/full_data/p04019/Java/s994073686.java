import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		String input[] = br.readLine().split("");
		int nFlag = 0;
		int wFlag = 0;
		int sFlag = 0;
		int eFlag = 0;
		for(String s:input) {
			if(s.equals("N")) {
				nFlag = 1;
			}else if(s.equals("S")) {
				sFlag = 1;
			}else if(s.equals("W")) {
				wFlag = 1;
			}else if(s.equals("E")) {
				eFlag = 1;
			}
		}
		if((nFlag == sFlag) && wFlag ==  eFlag ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
