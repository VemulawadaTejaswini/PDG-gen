import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		int q=Integer.parseInt(sc.next());
		sc.nextLine();
		long[] score=new long[n];
		while(sc.hasNextLine()) {
			score[Integer.parseInt(sc.nextLine())-1]++;
		}
		for(long l:score) {
			if(k-q+l>0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}