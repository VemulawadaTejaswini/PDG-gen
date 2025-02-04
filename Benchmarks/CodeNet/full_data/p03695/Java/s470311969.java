import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] ss0 = br.readLine().trim().split(" ", 0);
		Integer[] ii0 = new Integer[N];
		for(int i = 0; i < N; i++){
			ii0[i] = Integer.parseInt(ss0[i]);
		}
		
		int[] color = new int[9];
		for(int i: ii0) {
			if((1<=i)&&(i<=399)){
				color[0] += 1;
			}else if((400<=i)&&(i<=799)){
				color[1] += 1;
			}else if((800<=i)&&(i<=1199)){
				color[2] += 1;
			}else if((1200<=i)&&(i<=1599)){
				color[3] += 1;
			}else if((1600<=i)&&(i<=1999)){
				color[4] += 1;
			}else if((2000<=i)&&(i<=2399)){
				color[5] += 1;
			}else if((2400<=i)&&(i<=2799)){
				color[6] += 1;
			}else if((2800<=i)&&(i<=3199)){
				color[7] += 1;
			}else{
				color[8] += 1;
			}
		}
		
		int min=0;
		int max=0;
		for(int i=0; i < 8; i++) {
			if(color[i]>0){ min += 1; }
		}
		max = min + color[8];

		System.out.println(min + " " + max);

	return;
	}



}
