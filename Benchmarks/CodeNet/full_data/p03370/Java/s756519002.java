import java.util.*;
import java.util.stream.*;

public class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}

	public static void main(String[]$){
		int n=gInt(),x=gInt();
		int[]a=IntStream.range(0,n)
				.map(i->gInt())
				.sorted()
				.toArray();
		x-=Arrays.stream(a).sum();
		System.out.println(x/a[0]+n);
	}
}