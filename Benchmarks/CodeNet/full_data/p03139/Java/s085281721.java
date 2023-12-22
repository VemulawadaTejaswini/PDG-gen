import java.lang.*

public class Main {
    public static void main (String args[]) {
        int n = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        int max = 0;
        int min = 0;

        if (a == b) {
        	max = a;
        	min = 0;
        } else if (a > b) {
        	max = b;
        	min = a - b;
        } else {
        	max = a;
        	min = b - a;
        }

        System.out.println(max + " " + min);
    }
}
