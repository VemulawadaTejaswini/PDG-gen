
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sa[]=br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int[] dices= new int[n];
		sa = br.readLine().split(" ");
		double[] exp = new double[n];
		for(int i = 0 ; i< n ;i++) {
			dices[i] = Integer.parseInt(sa[i]);					
			exp[i] = ((double) dices[i]+1)/2;
		}
		double result = 0,current = 0;
		for(int i = 0 ; i < n ; i++) {
			current += exp[i];
			if(i >= k) {
				current -= exp[i-k];
			}
			result = Double.max(result, current);
		}
		System.out.println(result);
		
	}

}
