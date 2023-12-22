import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int r=sc.nextInt();
		int D=sc.nextInt();
		int x=sc.nextInt();

		for(int i=0;i<10;i++){
			int next=r*x-D;
			System.out.println(next);
			x=next;
		}

		sc.close();
	}

}
