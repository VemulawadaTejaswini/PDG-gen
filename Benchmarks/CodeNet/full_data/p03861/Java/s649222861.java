import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long x = scan.nextLong();
		long count = 0;

		count = b/x - a/x;

		if(a%x==0) {
			count++;
		}

		//if(a==b && a%x)
		//}

		/*
		count = (b-a)/x;


		if(a==0) {
			count = count +1;
		}

		if(a>=x) {
			count = count + 1;
		}



		if(a==b && a%x!=0) {
			count =0;
		}else if(a==b && a%x==0) {
			count =1;
		}

		//System.out.println((b-a)%x);

		 */
		System.out.println(count);
	}

}
