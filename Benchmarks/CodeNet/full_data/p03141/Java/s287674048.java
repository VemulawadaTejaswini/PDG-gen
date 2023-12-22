import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);

	static class D{
		public D(int a,int b){
			this.a=a;
			this.b=b;
		}
		int a,b;
	}
	public static void main(String[] $){
		int n=s.nextInt();
		
		ArrayList<D>l=new ArrayList<>();
		for(int i=0;i<n;++i)
			l.add(new D(s.nextInt(),s.nextInt()));
		
		l.sort(Comparator.<D>comparingInt(o->-o.a-o.b));
		
		long t=0,a=0;
		for(int i=0;i<n;++i) {
			if(i%2==0)
				t+=l.get(i).a;
			else
				a+=l.get(i).b;
		}
		System.out.println(t-a);
	}
}