import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int count = 0;
		for(int i = 1 ; i <= n ; i++) {
			int keta = 0;
			while(i >= 1) {
				i = i / 10;
				keta++;
			}
			if(keta % 2 == 1) {
				count++;
			}
		}
		
			System.out.println(count);

	}

}