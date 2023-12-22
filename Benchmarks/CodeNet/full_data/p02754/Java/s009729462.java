import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int blue = sc.nextInt();
        int red = sc.nextInt();
        int count = 0;

        if (blue == 0) {
	     count = 0;
	    } else {
	    count = n - red;
	    }
        System.out.println(count);
     }
}