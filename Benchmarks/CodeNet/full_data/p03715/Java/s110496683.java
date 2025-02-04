import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long h = sc.nextLong();
			long w = sc.nextLong();
			
			if(h % 3 ==0){
				System.out.println(0);
				continue;
			}
			
			long res = Long.MAX_VALUE;
			for(int i  =1; i < w; i++){
				long a = h / 2 * (w - i);
				long b = (h + 1) / 2 * (w - i);
				long c = h * i;
				
				long max = Math.max(a, Math.max(b, c));
				long min = Math.min(a, Math.min(b, c));
				res = Math.min(res, max - min);
			}
			
			for(int i  =1; i < h; i++){
				long a = w / 2 * (h - i);
				long b = (w + 1) / 2 * (h - i);
				long c = w * i;
				
				long max = Math.max(a, Math.max(b, c));
				long min = Math.min(a, Math.min(b, c));
				res = Math.min(res, max - min);
			}
			
			System.out.println(res);

		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
