import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int L=sc.nextInt();
		int n=L+1;
		int m=L+1;

		System.out.println(n+" "+m);

		System.out.println(1+" "+n+" "+0);
		System.out.println(1+" "+2+" "+0);

		for (int i=2;i<n;++i){
			System.out.println(i+" "+(i+1)+" "+1);
		}

	}

}