import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int y = in.nextInt();
		int[] ary = new int[7];
		
		// case 1 ok
		if ( y%10000 == 0 ) {
			ary[0] = y/10000;
		} else {
			ary[0] = -1;
		}
		
		// case 2 ok
		if ( y%5000 == 0 ) {
			ary[1] = y/5000;
		} else {
			ary[1] = -1;
		}
		
		// case 3 ok
		ary[2] = y/1000;
		
		// case 4 ok
		ary[3] = y/10000;
		int c4billsleft = (y-ary[3])*10000;
		if ( c4billsleft%5000 == 0 ) {
			ary[3]+= c4billsleft/5000;
		}
		
		// case 5 ok
		ary[4] = y/10000;
		int c5billsleft = (y-ary[4])*10000;
		ary[4] += c5billsleft/1000;
		
		// case 6 ok
		ary[5] = y/5000;
		int c6billsleft = (y-ary[5])*5000;
		ary[5] += c5billsleft/1000;
		
		// case 7 ok
		ary[6] = y/10000;
		ary[6] += ((y-ary[6])*10000)/5000;
		ary[6] += ((y-ary[6])*5000)/1000;
		
		if ( ary[0] == n ) {
			System.out.println( (y/10000) + " 0 0") ; // ok
		} else if ( ary[1] == n ) {
			System.out.println( "0 " + (y/5000) + " 0" ); // ok
		} else if ( ary[2] == n ) {
			System.out.println( "0 0 " + (y/1000)); // ok
		} else if ( ary[3] == n ) {
			int tenC3 = y/10000;
			System.out.println( tenC3 + " " + (((y-tenC3)*10000)/5000) + " 0");
		} else if ( ary[4] == n ) {
			int tenC4 = y/10000;
			System.out.println( tenC4 + " 0 " + (((y-tenC4)*10000)/1000) );
		} else if ( ary[5] == n ) {
			int tenC5 = y/5000;
			System.out.println( "0 " + tenC5 + " " + (((y-tenC5)*5000)/1000));
		} else if ( ary[6] == n ) {
			int tenC6 = y/10000;
			int fiveC6 = (y-tenC6)*10000;
			System.out.println( tenC6 + " " + fiveC6 + " " + (((y-fiveC6)*5000)/1000));
		} else {
			System.out.println("-1 -1 -1");
		}
	}
}