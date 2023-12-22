import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int d = scan.nextInt();
	int n = scan.nextInt();

	System.out.println((int)(n*Math.pow(100,d)));
    }
}
