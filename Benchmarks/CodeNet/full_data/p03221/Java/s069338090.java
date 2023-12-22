import java.util.*;
import java.util.Map.*;

class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		int n=s.nextInt(),m=s.nextInt();
		int[]p=new int[m];
		int[]y=new int[m];
		String[]r=new String[m];
		HashMap<Integer,TreeMap<Integer,Integer>>map=new HashMap<>();
		for(int q=0;q<m;++q) {
			p[q]=s.nextInt();
			y[q]=s.nextInt();
			map.computeIfAbsent(p[q],i->new TreeMap<>()).put(y[q],q);
		}
		for(Entry<Integer,TreeMap<Integer,Integer>> e:map.entrySet()) {
			int no=0;
			for(Entry<Integer,Integer>f:e.getValue().entrySet()) {
				r[f.getValue()]=String.format("%06d%06d",e.getKey(),++no);
			}
		}
		Arrays.stream(r).forEach(System.out::println);
	}
}