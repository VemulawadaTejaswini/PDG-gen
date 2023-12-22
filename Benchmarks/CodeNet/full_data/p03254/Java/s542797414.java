import java.util.*;

public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int x = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			Arrays.sort(data);
			int count = 0;
			for(int i = 0; i < n; i++){
				if(data[i] > x){
					break;
				}
				count++;
				x -= data[i];
			}
			if(x > 0 && count > 0 && count == n){
				count--;
			}
			System.out.println(count);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
