import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int x=in.nextInt();
		int m1= (x/500)*1000;
		int r= x-(m1/2);
		int m2=(r/5)*5;
		System.out.println(m1+m2);
	}
}