import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int max = 0,total = 0,temp;
		for(int i=0;i<sc.nextInt();i++) {
			temp = sc.nextInt();
			max = Math.max(temp, max);
			total += temp;
		}
		
		System.out.println(total - max / 2);
		sc.close();
	}

}
