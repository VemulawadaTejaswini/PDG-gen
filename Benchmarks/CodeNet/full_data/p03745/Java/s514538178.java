import java.util.ArrayDeque;
import java.util.Scanner;
class Main{
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt();
		ArrayDeque<Integer>a=new ArrayDeque<>(),b=new ArrayDeque<>();
		for(int i=0;i<n;++i) {
			int in=getInt();
			a.add(in);
			b.add(in);
		}

		System.out.println(Math.min(fal(a,true),fal(b,false)));
	}
	private static int fal(ArrayDeque<Integer>a,Boolean up){
		long v=up?-1:Long.MAX_VALUE;
		int c=1;
		while(!a.isEmpty()) {
			int poll=a.pollFirst();
			if(up==null) {
				up=v<poll;
			}
			if(!((up&&v<=poll)||((!up)&&v>=poll))) {
				++c;
				up=null;
			}
			v=poll;
		}
		return c;
	}
}
