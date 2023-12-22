import java.util.*;
import java.util.stream.LongStream;
public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String __[]){
		int x=s.nextInt(),y=s.nextInt();
		System.out.println(LongStream.of(
				calc( x,  y),
				calc(-x,  y)+1,
				calc( x, -y)+1,
				calc(-x, -y)+2).min().getAsLong());
	}
	static long calc(int x,int y) {
		return y-x<0?1145141919810L:y-x;
	}
}
