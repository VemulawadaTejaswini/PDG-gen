import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long n=sc.nextInt(),m=sc.nextInt();
			if(n<=2*m) System.out.println(n+(m-2*n)/4);
			else System.out.println(2*m);
		}
	}
}