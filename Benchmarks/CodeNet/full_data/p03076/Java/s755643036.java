import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		
		List<Integer> nlist = new ArrayList<Integer>();
		
		nlist.add(a);
		nlist.add(b);
		nlist.add(c);
		nlist.add(d);
		nlist.add(e);
		
		list = list.stream().map(s -> s % 10).collect(Collectors.toList());
		int min = list.stream().filter(s -> s != 0).min(Comparator.naturalOrder()).get();
		int minval = nlist.get(list.indexOf(min));
		nlist.remove(list.indexOf(min));
		List<Double> n2list = nlist.stream().map(s -> (double)s/10).map(s -> Math.ceil(s)).map(s -> s * 10).collect(Collectors.toList());
		
		double result = 0;
		for(double s :n2list) {
			result += s;
		}
		result += minval;
		int result1 = (int)result;
		System.out.println(result1);
		
	}
}