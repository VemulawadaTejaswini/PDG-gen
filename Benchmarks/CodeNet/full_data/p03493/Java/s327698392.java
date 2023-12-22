import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		
		int cnt=0;
		for(int i=s;i>0;i/=10) {
			int tar=i%10;
			if(tar==1) cnt++;
		}
		
		System.out.println(cnt);
	}
}
