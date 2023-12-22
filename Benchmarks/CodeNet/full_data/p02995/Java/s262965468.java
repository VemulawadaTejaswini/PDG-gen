import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        long a = Long.parseLong(input.next());
        long b = Long.parseLong(input.next());
        long c = Long.parseLong(input.next());
        long d = Long.parseLong(input.next());

        long ansA1 = (a - 1) / c;
        long ansA2 = (a - 1) / d;
        long ansA3 = (a - 1) / lcm(c, d);

        long ansB1 = b / c;
        long ansB2 = b / d;
        long ansB3 = b / lcm(c, d);

        long ansB = ansB1 + ansB2 - ansB3;
        long ansA = ansA1 + ansA2 - ansA3;

        long ans = ansB - ansA;
        long result = b - (a - 1) - ans;

        System.out.println(result);

    }

    static long lcm (long a, long b) {
    	long temp;
    	long c = a;
    	c *= b;
    	while((temp = a%b)!=0) {
    		a = b;
    		b = temp;
    	}
    	return (c/b);
    }

}
