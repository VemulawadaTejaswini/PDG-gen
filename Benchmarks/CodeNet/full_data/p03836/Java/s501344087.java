import java.util.*;

public class Main {
	
	private void doit(){
		
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			
			int sx = sc.nextInt();
			int sy = sc.nextInt();
			int tx = sc.nextInt();
			int ty = sc.nextInt();
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < ty - sy; i++){
				sb.append("U");
			}
			
			for(int i = 0; i < tx - sx; i++){
				sb.append("R");
			}
			
			for(int i = 0; i < ty - sy; i++){
				sb.append("D");
			}
			
			for(int i = 0; i < tx - sx; i++){
				sb.append("L");
			}
			sb.append("L");
			
			
			for(int i = 0; i < ty - sy + 1; i++){
				sb.append("U");
			}
			
			for(int i = 0; i < tx - sx + 1; i++){
				sb.append("R");
			}
			sb.append("D");
			sb.append("R");
			for(int i = 0; i < ty - sy + 1; i++){
				sb.append("D");
			}
			
			for(int i = 0; i < tx - sx + 1; i++){
				sb.append("L");
			}
			sb.append("U");
			System.out.println(sb.toString());
		}

	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
