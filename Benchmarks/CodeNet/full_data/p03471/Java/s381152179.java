	import java.util.*;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int Y = sc.nextInt();
			int x = 0;
			int y = 0;
			int z = 0;
			
			for(int i = 0; i<=N;i++) {
				x = i;
				for (int j =0;j<(N-i);j++) {
					y = j;
					int k = (Y - 10000*x -5000*y);
					if((k/1000 + x + y)<=N) {
						z = k/1000;
						break;
					}else {
						x = -1;
						y = -1;
						z = -1;
					}
				if (z != -1) {
					break;
				}
				}
			}
			
			System.out.println(x+" "+y+" "+z);
			
			sc.close();
		}
		
		
	}