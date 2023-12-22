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
			int m = sc.nextInt();
			int [] t = new int[m];
			for(int i = 0; i < m; i++){
				t[i] = sc.nextInt();
			}
			
			Arrays.sort(data);
			Arrays.sort(t);
			int ind = 0;
			boolean flg = true;
			for(int i = 0; i < t.length;i++){
				while(true){
					if(t[i] == data[ind]){
						ind++;
						break;
					}
					ind++;
					if(ind >= n){
						flg = false;
						break;
					}
				}
				if(!flg) break;
					
				
			}
			System.out.println(flg ? "YES" :"NO");
		}
	}



	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
