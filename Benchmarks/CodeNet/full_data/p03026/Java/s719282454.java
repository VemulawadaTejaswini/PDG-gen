import java.util.*;
import java.util.stream.*;

class Main{

	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]a=new int[n-1];
		int[]b=new int[n-1];
		int[]c=new int[n];
		for(int i=0;i<n-1;++i) {
			a[i]=s.nextInt()-1;
			b[i]=s.nextInt()-1;
			++c[a[i]];
			++c[b[i]];
		}
		System.err.println(Arrays.toString(c));

		int[]v=new int[n];
		Arrays.setAll(v,i->s.nextInt());
		Arrays.sort(v);

		int[]index=IntStream.range(0,n).boxed()
				.sorted(Comparator.<Integer>comparingInt(i->c[i]).thenComparing(Comparator.naturalOrder()))
				.mapToInt(i->i).toArray();

		int[]w=new int[n];
		for(int i=0;i<n;++i) {
			w[index[i]]=v[i];
		}

		int r=0;
		for(int i=0;i<n-1;++i)
			r+=Math.min(w[a[i]],w[b[i]]);
		System.out.println(r);
		System.out.println(Arrays.stream(w).mapToObj(String::valueOf)
				.collect(Collectors.joining(" ")));
	}
}