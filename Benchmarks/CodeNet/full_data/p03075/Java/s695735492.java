import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int d = scan.nextInt();
	int e = scan.nextInt();
	int k = scan.nextInt();

	/*
	int max = 0;
	max = Math.max(Math.max(Math.max(a,b),Math.max(c,d)),e);
	int min = 0;
	min = Math.min(Math.min(Math.min(a,b),Math.min(c,d)),e);
	*/

	if(e-a <= k){
	    System.out.println("Yay!");
	}else{
	    System.out.println(":(");
	}
    }
}
