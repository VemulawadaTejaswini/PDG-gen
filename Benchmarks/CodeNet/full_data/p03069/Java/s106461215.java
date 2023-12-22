import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		
		sc.close();
		
		int c = 0;
		boolean j = true;
		int k = 0;
		
		for(int i=0;i<n;i++) {
			if('.' == s.charAt(i)) {
				c++;
				if(j) {
					k++;
				}
			}else {
				j = false;
			}
		}
		
		System.out.println(Math.max(0,Math.min(c-k, n-c)));
	}

}
