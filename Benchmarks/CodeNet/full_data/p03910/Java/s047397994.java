import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long a=n*(n+1)/2;
		BitSet b=new BitSet(n);
		b.set(1,n+1);
		for(int i=n;i>0;--i){
			if(a-i>=n){
				a-=i;
				b.clear(i);
			}
		}
		b.stream().forEach(System.out::println);
	}
}