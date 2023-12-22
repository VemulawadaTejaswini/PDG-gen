import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		boolean[] probFlag = new boolean[n];
		int[] probWa = new int[n];
		int correct = 0 ,wa = 0 ;
		
		for(int i = 0 ; i < m ; i++) {
			s = br.readLine().split(" ");
			int p = Integer.parseInt(s[0]);
			String res = s[1];
			if(res.equals("WA") && !probFlag[p-1]) {
				probWa[p-1]++;
			}else if(res.equals("AC") && !probFlag[p-1]) {
				probFlag[p-1] = true;
				correct ++;
				wa += probWa[p-1];
			}
		}
		
		System.out.println(correct +" "+wa);
	}

}
