import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long n=sc.nextInt(),m=sc.nextInt();
			System.out.println(Math.min(m/2, (m+2*n)/4));
		}
	}
}