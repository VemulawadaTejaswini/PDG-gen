import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
	    long c = sc.nextLong();
        double root = Math.sqrt(a*b);
        System.out.println(a+b+2*root < c?"Yes":"No");

    }
}