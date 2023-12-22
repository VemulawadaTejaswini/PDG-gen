import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int a=sc.nextInt(),b=sc.nextInt(),x=sc.nextInt();

	if(x-a<0 || (a+b)<x) {
		System.out.println("NO");
	}else {
		System.out.println("YES");
	}

	}
}