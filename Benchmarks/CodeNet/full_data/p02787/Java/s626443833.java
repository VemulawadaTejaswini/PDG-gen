
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] hn = br.readLine().split(" ");
		int h = Integer.parseInt(hn[0]);
		int n = Integer.parseInt(hn[1]);
		int[] darray = new int [h+1];
		int[] a = new int[n];
		int[] b = new int[n];
		int bmin = Integer.MAX_VALUE;
		for(int i = 0 ; i < n ; i++) {
			String[] ab = br.readLine().split(" ");
			a[i] = Integer.parseInt(ab[0]);
			b[i] = Integer.parseInt(ab[1]);
			bmin = Math.min(bmin, b[i]);
		}
		for(int i = 0 ; i < h+1 ; i++) {
			darray[i] = Integer.MAX_VALUE;
		}
		for(int i = 0; i <= h ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i >= a[j]) {
					darray[i] = Math.min(darray[i], darray[i-a[j]]+b[j]);
				}			
			}
			if(i == 0){
				darray[i] = 0;
			}else if(darray[i] == Integer.MAX_VALUE) {
				darray[i] = bmin;
			}
		}
		System.out.println(darray[h]);
	}

}
