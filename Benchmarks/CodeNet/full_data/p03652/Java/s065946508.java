import static java.util.Comparator.naturalOrder;
import static java.util.stream.Collectors.toList;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt(),m=getInt();
		List<List<Integer>>a=REPS(n).mapToObj(i->INS(m).boxed().collect(toList())).collect(toList());
		HashMap<Integer,Integer>count=new HashMap<>();
		int r=n;
		for(int i=0;i<m-1;++i){
			count.clear();
			for(int j=0;j<n;++j)
				count.merge(a.get(j).get(0),1,Integer::sum);
			r=Math.min(r,count.values().stream().max(naturalOrder()).get());
			Integer remove=count.entrySet().stream().max(Entry.comparingByValue()).get().getKey();
			a.stream().forEach(o->o.remove(remove));
		}
		System.out.println(r);
	}
}