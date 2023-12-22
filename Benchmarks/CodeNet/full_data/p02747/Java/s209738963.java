import static java.util.stream.IntStream.range;
import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		String t=s.next();
		System.out.println(t.length()%2==0&&range(0,t.length()).allMatch(i->t.charAt(i)==(i%2==0?'h':'i'))
				?"Yes":"No");
	}
}
