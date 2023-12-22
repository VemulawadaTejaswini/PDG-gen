import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		int[][] arr = new int[M][4];
		for(int i=0;i<M;i++) {
			token = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(token.nextToken());
			arr[i][1] = Integer.parseInt(token.nextToken());
			arr[i][2] = i;
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
			
		});
		int[] arrC = new int[N+1];

		for(int i=0;i<M;i++) {
			arr[i][3] = ++arrC[arr[i][0]];
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
			
		});
		
		for(int i=0;i<M;i++) {
			System.out.println(leftPad(arr[i][0]) + leftPad(arr[i][3]));
		}
	}
	
	private static String leftPad(int num) {
		if(num > 99999) return ""+num;
		else if(num > 9999) return "0"+num;
		else if(num > 999) return "00"+num;
		else if(num > 99) return "000"+num;
		else if(num > 9) return "0000"+num;
		else if(num > 0) return "00000"+num;
		return "";
	}
}