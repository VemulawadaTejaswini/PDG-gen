import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int length = String.valueOf(n).length();
	
	int result = 0;
	for (int i = length; i > 0; i--) {
	    if(i % 2 == 0) {
		result += Math.pow(10, i - 1) - Math.pow(10, i - 2);
		i--;
	    }
	    else {
		result += n - Math.pow(10, i - 1) + 1;
	    }
	}
	
	System.out.println(result);
    }
}
