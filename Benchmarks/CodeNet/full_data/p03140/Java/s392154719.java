
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		
		sc.close();


		int count=0;
		for(int i=0;i<n;i++) {	
			if(a.charAt(i) == b.charAt(i)) {
				if(a.charAt(i) == c.charAt(i)) {
					continue;
				}else {
					count++;
					continue;
				}
			}else {
				count++;
				if(a.charAt(i) == c.charAt(i)) {
					continue;
				}else {
					if(b.charAt(i) == c.charAt(i)) {
						continue;
					}else {
						count++;
						continue;
					}
				}
			}
		}
		
		System.out.println(count);

		
	}

}
