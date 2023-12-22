import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		HashMap<Integer,Integer>x=new HashMap<>(),y=new HashMap<>();

		for(int i=0;i<n;++i) {
			x.merge(s.nextInt()-1,1,Integer::sum);
			y.merge(s.nextInt()-1,1,Integer::sum);
		}

		//System.err.println(x);
		//System.err.println(y);

		System.out.println(f(x)*f(y));
	}

	private static int f(Map<Integer,Integer> x){
		return (int)x.values().stream().mapToLong(o->o-1).sum();
	}
}
