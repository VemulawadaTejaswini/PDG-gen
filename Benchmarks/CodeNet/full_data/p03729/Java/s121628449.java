import java.util.Comparator;
import java.util.Scanner;

class Main{


	static int[][] map ;
	static long INF =Long.MAX_VALUE/2;
	static int n,m ;
	static	long[] dis;

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		if(a.charAt(a.length()-1) == b.charAt(0) && b.charAt(b.length()-1) == c.charAt(0)){
			System.out.println("YES");
		}else{
			System.out.println("NO");

		}
		
		
	}
}





class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {

		int num1 = (int)obj1;
		int num2 = (int)obj2;

		if(num1 < num2) {
			return 1;
		} else if(num1 > num2) {
			return -1;
		} else{
			return 0;
		}
	}
}


