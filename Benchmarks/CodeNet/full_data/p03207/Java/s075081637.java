import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		IntSummaryStatistics o=IntStream.range(0,s.nextInt()).map(i->s.nextInt())
			.summaryStatistics();
		System.out.println(o.getSum()-o.getMax()/2);
	}
}
