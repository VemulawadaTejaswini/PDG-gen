import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days = scan.nextInt();
		int count = scan.nextInt();
		int res = 0;
		for(int i=0;i<count;i++){
			res+= scan.nextInt();
		}
		days -= res;
		if(res<0)
			System.out.println(-1);
		else
			System.out.println(days);

	}

}
