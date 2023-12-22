import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		long takahasi=0,nakahasi=0,hikuhasi=0;
		long kaisu=0;
		long sum=0;
		sc=new Scanner(System.in);

		takahasi=Long.parseLong(sc.next());
		nakahasi=Long.parseLong(sc.next());
		hikuhasi=Long.parseLong(sc.next());
		kaisu=Long.parseLong(sc.next());
		sum=takahasi+nakahasi+hikuhasi;

		if(takahasi==nakahasi && nakahasi==hikuhasi) {
			System.out.println("0");
			System.exit(0);
		}
		else {
			for(int i=0; i<kaisu; i++) {
				takahasi=sum-takahasi;
				nakahasi=sum-nakahasi;
				hikuhasi=sum-hikuhasi;
				sum*=2;
			}
		}
		if(Math.abs(takahasi-nakahasi)>1000000000000000000l) {
			System.out.println("Unfair");
		}
		else {
			System.out.println(takahasi-nakahasi);
		}
	}
}