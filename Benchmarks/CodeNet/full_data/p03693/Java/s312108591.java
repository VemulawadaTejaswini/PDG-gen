import java.util.Scanner;

class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);


	//System.out.println("r:");
	int r = std.nextInt();
	int g = std.nextInt();
	int b = std.nextInt();


	if(100*r + 10*g + b % 4 == 0){
		System.out.println("YES");}
	else
		{System.out.println("NO");}


      }
}