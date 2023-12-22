import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		int a=n%k;
		int b=k-a;
		if(a>b)a=b;
		System.out.println(a);
	}

}