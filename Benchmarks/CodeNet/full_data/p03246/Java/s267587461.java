import java.util.*;
import java.util.Map.*;

public class Main{
	static Scanner s=new Scanner(System.in);

	public static void main(String[] $){
		HashMap<Integer,Integer> o=new HashMap<>(),e=new HashMap<>();

		int n=s.nextInt();

		for(int i=0;i<n;++i)
			(i%2==0?e:o).merge(s.nextInt(),1,Integer::sum);

		Comparator<Entry<Integer,Integer>> c=Entry.<Integer,Integer>comparingByValue().thenComparing(Entry.comparingByKey());
		Entry<Integer,Integer> O=o.entrySet().stream().max(c).get();
		Entry<Integer,Integer> E=e.entrySet().stream().max(c).get();
		o.remove(O.getKey());
		e.remove(E.getKey());
		Entry<Integer,Integer> O2=o.entrySet().stream().max(c).orElse(null);
		Entry<Integer,Integer> E2=e.entrySet().stream().max(c).orElse(null);

		int r=O.getValue()+E.getValue();
		if(O.getKey()==E.getKey()){
			r=Math.max(O.getValue()+(E2==null?0:E2.getValue()),E.getValue()+(O2==null?0:O2.getValue()));
		}

		System.out.println(n-r);
	}
}
