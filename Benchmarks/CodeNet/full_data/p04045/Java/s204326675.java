import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		boolean[] hako = new boolean[10];
		for (int i=0; i<10; i++) {
			int d = sc.nextInt();
			hako[d] = true;
		}
		
		int curr = n;
		int tmp;
		boolean valid;
		
		while(true) {
			tmp=curr;
			valid=true;
			while (tmp!=0) {
				if (hako[tmp %10]) {
					valid=false;
					break;
				}
				tmp = tmp /10;
			}
			if (valid) {
				break;
			}
			curr += 1;
		}

		
		System.out.println(curr);
		sc.close();
	}

}
