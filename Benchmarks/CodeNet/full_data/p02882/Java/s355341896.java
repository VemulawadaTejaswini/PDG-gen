import java.util.Scanner;

class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	double x = sc.nextDouble();
      	double h = x /(a*a);
      	System.out.println(90-(90*(h/b)));
	}
}