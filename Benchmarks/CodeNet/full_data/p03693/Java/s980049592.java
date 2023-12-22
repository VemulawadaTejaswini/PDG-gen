import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int r = sc.nextInt();
    	int g = sc.nextInt();
        int b = sc.nextInt();
    	if (b%2==0) {
    		System.out.println("Even");
    	} else {
    		System.out.println("Odd");
    	}
 
    }
}