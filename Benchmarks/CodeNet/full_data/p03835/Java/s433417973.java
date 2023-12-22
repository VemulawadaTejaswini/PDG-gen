import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int s = sc.nextInt();
		
		if(s==3*k) {
			System.out.println(1);
		}else if(s < 3*k){
			int count = 0;
			while(s>0) {
				count += 3;
				s--;
			}
			System.out.println(count);
		}
    }
}
