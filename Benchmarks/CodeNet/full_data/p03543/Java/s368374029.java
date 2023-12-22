import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		no1();
	}
 
	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			Integer N = sc.nextInt();
 
			Integer a = N / 1000;
			Integer b = (N-a*1000) /100;
			Integer c = (N-a*1000-b*100)/10;
			Integer d = (N-a*1000-b*100-c*10);
 
			if ((a==b && b ==c) || (b ==c && c ==d))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}