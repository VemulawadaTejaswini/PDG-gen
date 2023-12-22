import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		execute();
	}
	
	private static final long WARU = 1000000007;
	
	private static void execute() {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			long ans = 1;
			
			int[] arr = new int[3];
			for(int x=0; x<3; x++) {
				arr[x] = -1;
			}
			
			for(long i=0; i<n; i++) {
				int c = sc.nextInt();
				int b = 0;
				for(int x=0; x<3; x++) {
					if(c-1 == arr[x]) {
						if(b==0) {
							arr[x] = c;
						}
						b++;
					}
				}
				ans = ans*b;
			}
			
			System.out.println(ans%WARU);
		}
	}
}