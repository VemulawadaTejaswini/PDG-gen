import java.util.*;

public class Main{
	public static void main(String[] $){
		var s=new Scanner(System.in);

		var n=s.nextInt();
		var b=new String[n];
		Arrays.setAll(b,i->s.next());

		var m=s.nextInt();
		var a=new String[m];
		Arrays.setAll(a,i->s.next());

		var r=Arrays.stream(b).mapToLong(o->
				Arrays.stream(b).filter(o::equals).count()
						-Arrays.stream(a).filter(o::equals).count())
				.max().getAsLong();

		System.out.println(Math.max(0,r));
	}
}
