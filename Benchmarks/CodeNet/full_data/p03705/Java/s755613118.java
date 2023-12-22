import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static final Scanner s = new Scanner(System.in);
	static IntStream REPS(int v){
		return IntStream.range(0,v);
	}
	public static void main(String[]__){
		long n=s.nextInt(),a=s.nextInt(),b=s.nextInt();
		long v=(a+b*(n-1))-(a*(n-1)+b);
		System.out.println(v<0?0:v+1);
	}
}
