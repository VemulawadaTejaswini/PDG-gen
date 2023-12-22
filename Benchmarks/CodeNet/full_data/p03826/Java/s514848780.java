import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int d = scan.nextInt();

	int r1 = a*b;
	int r2 = c*d;
	if(r1 >= r2){
	    System.out.println(r1);
	}else{
	    System.out.println(r2);
	}
    }
}
	
