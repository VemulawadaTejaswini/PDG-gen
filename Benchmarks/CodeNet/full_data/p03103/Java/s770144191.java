import java.util.Scanner;

public class Main {
	public static void sout_data (int[][] data,int s,int e) {
		int pivot = data[s][0];
		int r = s;
		int l = e;
		if(e - s < 2) {
			if(data[s][0] > data[e][0]) {
				int[] change = data[r];
				data[r] = data[l];
				data[l] = change;
			}
			return;
		}
		
		while(r < l) {
			while(r < e && pivot > data[r][0]){
				r++;
			}
			while(l > s && pivot <= data[l][0]){
				l--;
			}
			if(l <= r) {
				break;
			}
			int[] change = data[r];
			data[r] = data[l];
			data[l] = change;
		}
		
			sout_data(data,s,l);
			sout_data(data,r,e);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] data = new int[N][2];
		long result = 0;
		boolean flag = true;
		
		for(int i = 0; i < N; i++) {
			 data[i][0] = sc.nextInt();
			 data[i][1] = sc.nextInt();
		}
		
		sout_data(data,0,N-1);
		
		int i = 0;
		int count_m = 0;
		int count = 0;
		
		while(M != count_m) {
			result += data[i][0];
			count++;
			count_m++;
			
			int next_i = count/data[i][1];
			count = count%data[i][1];
			i += next_i;
		}
		System.out.println(result);
	}
}
