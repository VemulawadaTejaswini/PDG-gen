import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long x = scan.nextLong();

		if(a==b){
			if(a%x==0){
			System.out.println(1);
			}else{
				System.out.println(0);
			}
			scan.close();
			return;
		}

		long ax = (a-1)/x;
		long bx = b/x;

		System.out.println(bx-ax);

		scan.close();
	}
}
