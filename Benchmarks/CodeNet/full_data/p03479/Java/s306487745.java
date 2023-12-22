import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  x= sc.nextInt();
		int y = sc.nextInt();
		int count = 0;
		int z = y/x;
		while(z >= Math.pow(2,count-1)) {
			count++;
		}
		System.out.println(count-1);
		sc.close();

	}

}