import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = n;
		int count = 1;	//桁数
		int minSum = 0;

		while(a>0) {
			a = a/10;
			count++;
		}
		if(a == 0) {
			System.out.println(10);
		}else {
			for(int i=1;i<count;i++) {
				int b = n%10;
				//System.out.println(b);
				minSum = minSum + b;
				n = n/10;
			}
			System.out.println(minSum);
		}

	}

}
