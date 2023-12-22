import java.util.Scanner;

class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);


	//System.out.println("r:");
	int r = std.nextInt();
	int g = std.nextInt();
	int b = std.nextInt();
	
	int a = 100*r + 10*g + b;

	if(a % 4 == 0){
		System.out.print("YES");}
	else
		{System.out.print("NO");}


      }
}