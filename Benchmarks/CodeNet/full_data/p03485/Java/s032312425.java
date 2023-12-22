import java.util.Scanner;

	public class Main {
	       public static void main(String[] args){
					Scanner sc = new Scanner(System.in);
					int a = sc.nextInt();
					int b = sc.nextInt();
					int x = 0;
					if(1 <= a && b <= 100) {x = (a + b)/2;}
					System.out.println(Math.ceil(x));
	       }}