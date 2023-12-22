import java.util.*;
import java.util.regex.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		s.next();
		int k=s.nextInt();
		Matcher m=Pattern.compile("(.)\\1*").matcher(s.next());
		List<Integer>l=new ArrayList<>();
		while(m.find())
			l.add(m.group().length());
		System.out.println(l.stream().mapToInt(i->i-1).sum()+Math.min(k*2,l.size()-1));
	}
}
