import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int max = 0;
        int min = -1;

        if (n >= a + b) {
        	min = 0;
        } else {
        	min = n - a + b;
        }

        if (a > b) {
        	max = b;
        } else {
        	max = a;
        }

        System.out.println(max + " " + min);
    }
}
