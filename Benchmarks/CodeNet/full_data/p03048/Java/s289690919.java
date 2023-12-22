import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int R = sc.nextInt();
			int G = sc.nextInt();
			int B = sc.nextInt();
			int N = sc.nextInt();
			int ret = 0;
			
			for(int r=0;r*R<=N;r++) {
				for(int g=0;g*G<=N;g++) {
					if(r*R+g*G>N) {
						break;
					}
					if((N-r*R-g*G)%B==0) {
						ret++;
					}
				}
			}
			
			
			System.out.println(ret);
			
	    }
		
		
	}
