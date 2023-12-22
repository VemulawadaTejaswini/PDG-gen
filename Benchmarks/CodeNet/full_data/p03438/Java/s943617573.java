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
			
			long suma = data1[n-1], sumb = data2[n-1];
			for(int i = 0; i < n-1; i++){
				long a = data1[i];
				long b = data2[i];
				if(a < b){
					if((a + b) % 2 == 0){
						sumb += (b - a) / 2;
					}
					else{
						sumb += (b - a) /2 + 1;
						suma += 2;
					}
				}
				else if(a > b){
					suma += (a - b) * 2;
				}
			}
			if(suma <= sumb){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
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
