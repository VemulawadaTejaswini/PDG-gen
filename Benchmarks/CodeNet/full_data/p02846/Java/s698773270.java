import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int  t1 = sc.nextInt();
		int  t2 = sc.nextInt();
		long a1 = sc.nextLong();
		long a2 = sc.nextLong();
		long b1 = sc.nextLong() - a1;
		long b2 = sc.nextLong() - a2;
		
		b1 *= t1;
		b2 *= t2;
		long diff = b1 + b2;
		
		if (diff == 0){
			System.out.print("infinity");
			return;
		}
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(diff);
		if ((Math.signum(b1) * Math.signum(b2)) >= 0){
			System.out.print("01");
			return;
		}
		
		if (Math.abs(b1) > Math.abs(b2) ){
			System.out.print("02");
			return;
		}
		
		if (Math.abs(b1) > Math.abs(b2) ){
			System.out.print("03");
			return;
		}
		//System.out.print((int)Math.ceil((double)Math.abs(b1) / Math.abs(diff)));
		System.out.print(1 +(int)Math.floor((double)Math.abs(b1) / Math.abs(diff))*2);
	}
}