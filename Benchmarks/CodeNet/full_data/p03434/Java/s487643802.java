import java.util.*;


public class Main {
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			Arrays.sort(data);
			int sum = 0;
			int count = 0;
			for(int i = n-1; i >= 0; i--){
				if(count % 2 == 0){
					sum += data[i];
				}
				else{
					sum -= data[i];
				}
				count++;
			}
			System.out.println(sum);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
