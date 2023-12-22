import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int start = 0;
		int packet = 1;
		int gen = 0;
		
		while(start!=k-1) {
			if(packet!=a) {
				packet++;
				start++;
			}else {
				start++;
				packet = 0;
				gen++;
			}
		}
		if(packet==a) {
			System.out.println(gen*b + b);
		}else {
			System.out.println(gen*b + packet);
		}
		
    }

}
