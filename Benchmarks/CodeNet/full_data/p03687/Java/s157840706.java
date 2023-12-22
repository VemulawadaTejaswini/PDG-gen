import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	public static void main(String[] __){
		String str=s.next();
		HashMap<Character,ArrayList<Integer>> h=new HashMap<>();
		for(char c='a';c<='z';c++){
			h.put(c,new ArrayList<>());
			h.get(c).add(-1);
		}
		
		for(int i=0;i<str.length();i++){
			final char c=str.charAt(i);
			h.get(c).add(i);
		}
		
		for(char c='a';c<='z';c++){
			h.get(c).add(str.length());
		}
		System.out.println(h.values().stream().mapToInt(o->{
			int max=-114514;
			for(int i=1;i<o.size();i++)
				max=Math.max(max,o.get(i)-o.get(i-1));
			return max;
		}).min().getAsInt()-1);
	}
}
