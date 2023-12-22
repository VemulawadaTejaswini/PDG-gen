import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int sum;
	
	if(a <= c && c < b && b <= d) {
	    sum = b - c;
	    System.out.println(sum);
	    return;
	}
	
	if(a <= c && b >= d) {
	    sum = c - d;
	    System.out.println(sum);
	} else {
	    sum = 0;
	    System.out.println(sum);
	}
    }
}