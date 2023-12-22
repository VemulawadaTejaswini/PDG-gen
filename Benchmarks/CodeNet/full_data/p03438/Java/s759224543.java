import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data1 = new int[n];
			int [] data2 = new int[n];
			for(int i = 0; i < n; i++){
				data1[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++){
				data2[i] = sc.nextInt();
			}
			long cap = 0;
			for(int i = 0; i < n; i++){
				if(data1[i] < data2[i]){
					cap += (data2[i] - data1[i]) / 2;
				}
			}
			
			for(int i = 0; i < n; i++){
				if(data1[i] > data2[i]){
					cap -= (data1[i] - data2[i]);
				}
			}
			if(cap < 0){
				System.out.println("No");
			}
			else{
				System.out.println("Yes");
			}
			
		}
	}



	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
