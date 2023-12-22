import java.util.*;

public class Main {
	double EPS = 10.e-08;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++) {
				data[i] = sc.nextInt();
			}
			data[0]--;
			
			boolean flg = true;
			for(int i = 1; i < n; i++){
				if(data[i-1] < data[i]){
					data[i]--;
					continue;
				}
				if(data[i-1] == data[i]) {
					continue;
				}
				else {
					flg = false;
					break;
				}
			}
			System.out.println(flg ? "Yes" : "No");
			
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
