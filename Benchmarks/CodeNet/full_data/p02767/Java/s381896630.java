
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] as = br.readLine().split(" ");
		int[] ar = new int[n];
		int sum = 0;
		int max = 0 , min = Integer.MAX_VALUE;
		for(int i = 0 ; i < n ; i ++){
			ar[i] = Integer.parseInt(as[i]);
			sum+= ar[i];
			max = Math.max(max, ar[i]);
			min = Math.min(min, ar[i]);
			
		}
		int average = sum/n;
		int res =0;
		int res2 = 0;
		int res3 = 0;
		for(int i = 0 ; i< n ; i++) {
			res += (ar[i]-average)*(ar[i]-average);
			res2 +=(ar[i]-average-1)*(ar[i]-average-1);
			res3 +=(ar[i]-average+1)*(ar[i]-average+1);
		}
		int gati_res = Math.min(res, res2);
		gati_res= Math.min(gati_res,res3);
		System.out.println(gati_res);
		
	}

}
