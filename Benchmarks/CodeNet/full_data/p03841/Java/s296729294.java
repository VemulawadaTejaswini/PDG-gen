import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String [] input = br.readLine().split(" ");
		int [] array = new int[N*N];
		int count = 1;
		boolean notFlag = false;
		for(String s : input) {
			int temp = Integer.parseInt(s);
			if(count != 1 && (temp - 1) < count) {
				notFlag = true;
				break;
			}
			if(array[temp-1] == 0) {
				array[temp-1] = count;
				count++;
			}else {
				notFlag = true;
				break;
			}
		}
		int point = 1;
		count = 1;
		for(String s : input) {
			int limit = Integer.parseInt(s);
			for(int i=0 ; i<N*N ; i++) {
				if(limit-1 > i && array[i] == 0 && point != count) {
					array[i] = point;
					count++;
				}
			}
			if(count != point) {
				notFlag = true;
				break;
			}
			point++;
			count = 1;
		}
		point = 1;
		count = 0;
		for(int i=0 ;i<N*N;i++) {
			int temp = N - point;
			if(array[i] == 0) {
				array[i] = point;
				count++;
			}
			if(count == temp) {
				count = 0;
				point++;
			}
		}
		if(notFlag) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
			int co = 1;
			for( int re : array ) {
				if(N*N > co) {
					System.out.print(re+" ");
				}else {
					System.out.print(re);
					System.out.println();
				}
				co++;
			}
		}
	}
}