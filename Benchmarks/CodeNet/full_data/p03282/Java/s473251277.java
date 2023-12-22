import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		long k = sc.nextLong();

					// System.out.println("test"+s.substring(0,1));
					// System.out.println("test"+s.substring(1,2));
			if(s.substring(0,1).equals("1")){
				if(k==1l){
					System.out.println("1");
				}else{
					// System.out.println("1 but second");
					System.out.println(s.substring(1,2));
				}

			}else{
					// System.out.println("not 1");
		System.out.println(s.substring(0,1));

	}

		// 			System.out.println("test");
		// double a = 2d;
  //   	double b = 500000000000d;
		// System.out.println(Math.pow(a,b));
	}
}