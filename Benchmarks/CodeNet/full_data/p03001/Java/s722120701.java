import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int W = Integer.parseInt(scanner.next());
	    int H = Integer.parseInt(scanner.next());
	    int x = Integer.parseInt(scanner.next());
	    int y = Integer.parseInt(scanner.next());
	    
	    double m = (double)((W * H) / 2);
	    int n = 0;
	    
	    if ((W== 2*x) && (H == 2*y)) {
	    	n=1;
	    }

        System.out.print(m + " " + n);
	}
}