import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean r = false;
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if((i*j)==n) {
					r = true;
					break;
				}
			}
		}
		System.out.println(r?"Yes":"No");
		sc.close();
	}
}