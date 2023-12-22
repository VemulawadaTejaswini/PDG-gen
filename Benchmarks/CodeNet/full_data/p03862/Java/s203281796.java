import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int[] in = new int[s.nextInt()-1];
		int x = s.nextInt();

		in[0]+=s.nextInt();
		for (int i=0;i<in.length-1;i++) {
			in[i+1]+=Integer.parseInt(s.next());
			in[i]+=in[i+1];
		}
		in[in.length-1]+=s.nextInt();


		//System.out.println(Arrays.toString(in));
		long r=0;
		int b;
		for(int i=0;i<in.length-1;++i) {
			if(in[i]>x) {
				b=in[i]-x;
				r+=b;
				in[i]-=b;
				in[i+1]-=b;
			}
		}
		if(in[in.length-1]>x) {
			b=in[in.length-1]-x;
			r+=b;
			in[in.length-1]-=b;
		}
		//System.out.println(Arrays.toString(in));
		System.out.println(r);
	}
}