import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        double p = (2.0 * a*a*b-2.0*x)/(a*a);
        double radian = Math.atan(p/a);
        System.out.println(Math.toDegrees(radian));
    }
}