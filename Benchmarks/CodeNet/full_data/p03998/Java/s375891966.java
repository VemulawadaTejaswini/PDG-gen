import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			StringBuilder [] data = new StringBuilder[3];
			
			for(int i = 0; i < 3; i++){
				data[i] = new StringBuilder(sc.next());
			}
			
			int [] inds = new int[3];
			int ind = 0;
			
			while(true){
				if(data[ind].length() == inds[ind]){
					System.out.println((char)('A' + ind));
					break;
				}
				
				char c = data[ind].charAt(inds[ind]);
				inds[ind]++;
				if(c == 'a'){
					ind = 0;
				}
				else if(c == 'b'){
					ind = 1;
				}
				else{
					ind = 2;
				}
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
