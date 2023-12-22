import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		long a=s.nextLong(),b=s.nextLong(),x=s.nextLong();
		long r=(a%x==0)?1:0;
		System.out.println(b/x-a/x+r);
	}
}