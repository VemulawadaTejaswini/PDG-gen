import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean check = false;
		if(a==1||a==2) {
			System.out.println(a);
			System.exit(0);
		}
		
	
		for(;;) {
		
			for(int j = 2;j*j<a;j++) {
				
				if(a%j==0) {
					check = false;
					break;
				}
				else {
					check = true;
				}
				
			}
			
			if(check) {
				System.out.println(a);
				break;
			}
			a= a+1;
			
			
			
		}
		
	}

}
