import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String [] input = br.readLine().split(" ");
		int [] array = new int[N*N];
		String []order = new String[N];
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
		if(!notFlag) {
			int orCo=0;
			for(int j=0;j<N*N ;j++) {
				if(array[j] != 0) {
					String co = String.valueOf(j+1);
					String value = String.valueOf(array[j]);
					order[orCo]= co+":"+value;
					orCo++;
				}
			}
			int point = 1;
			count = 1;
			for(int x =0 ; x<N ; x++) {
				String [] temp = order[x].split(":");
				int limit = Integer.parseInt(temp[0]);
				point = Integer.parseInt(temp[1]);
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
				//point++;
				count = 1;
			}
			if(!notFlag) {
				point = 1;
				count = 0;
				orCo = N-1;
				String [] sp;
				boolean endFlag = false;
				for(int i=N*N-1 ;i>=0;i--) {
					if(orCo < 0 ) {
						break;
					}
					sp = order[orCo].split(":");
					point = Integer.parseInt(sp[1]);
					int temp = N - point;
					if(count == temp) {
						count = 0;
						orCo--;
						point++;
						endFlag = true;
					}
					if(array[i] == 0 && !endFlag) {
						array[i] = point;
						count++;
					}else if((array[i] == 0 && endFlag)){
						i++;
						endFlag = false;
					}
				}
			}
		}
		int co = 0;
		if(notFlag) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
			co = 1;
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