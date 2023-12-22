import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int r = scan.nextInt();
	int d = scan.nextInt();
	int[] x = new int[11];
	x[0] = scan.nextInt();

	for(int i = 1; i < 11; i++){
	    x[i] = r*x[i-1]-d;
	}

	for(int i = 1; i < 11; i++){
	    System.out.println(x[i]);
	}
    }
}
