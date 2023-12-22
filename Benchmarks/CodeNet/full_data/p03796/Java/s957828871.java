import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		long p=1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long x=1;
		do {
			p= p%(100000000+7);
			if(x==n+1)break;
			p=p*x;
			x++;
		}while(true);
		System.out.println(p);
		scan.close();
	}
}