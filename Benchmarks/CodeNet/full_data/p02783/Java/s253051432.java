import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if(n%k==0) {
		System.out.println((n/k));
		}else {
			System.out.println((n/k)+1);

		}
 
		sc.close();
	}
}