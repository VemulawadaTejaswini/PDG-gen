import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] btn = new int[N];
		for(int i = 0; i<N; i++) {
			btn[i] = sc.nextInt();
		}
		String s = "-1";
		int count = 0;
		int light = btn[0];
		while(true) {
			light = btn[light-1];
			if(light == 2) {
			s = count+"";
				break;
			}
			if(count > N) {
				break;
			}
			count++;
			
		}
		System.out.println(s);
	}
	
}