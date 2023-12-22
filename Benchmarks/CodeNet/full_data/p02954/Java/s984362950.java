import java.util.*;

public class Main {
	double EPS = 10.e-08;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			char [] data = sc.next().toCharArray();
			int n = data.length;
			int [] res = new int[n];
			// count L
			int count = 0;
			int rind = 0;
			for(int i =0; i < n; i++){
				if(data[i] == 'R') {
					rind = i;
					count =0;
				}
				else {
					count++;
					if(count % 2 == 0){
						res[rind]++;
					}
					else{
//						debug(rind);
						res[rind+1]++;
					}
				}
			}
//			debug(res);
			// count R
			count = 0;
			int lind = n-1;
			for(int i =n-1; i >= 0; i--){
				if(data[i] == 'L') {
					lind = i;
					count =0;
				}
				else {
					count++;
					if(count % 2 == 0){
						res[lind]++;
					}
					else{
						res[lind-1]++;
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < n; i ++){
				sb.append(" " + res[i]);
			}
			System.out.println(sb.substring(1));
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
