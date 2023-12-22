import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		if(m>0) {
			System.out.println(-1);
			return;
		}
		System.out.println(IntStream.range(0,n+1).mapToObj(i->i+" "+i)
				.collect(Collectors.joining(" ")));
	}
}