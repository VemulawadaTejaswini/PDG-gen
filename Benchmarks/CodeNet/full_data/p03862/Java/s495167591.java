import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int[] in = new int[s.nextInt()];
		int x = s.nextInt();
		for (int i=0;i<in.length;i++) {
			in[i]+=Integer.parseInt(s.next());
		}
		long r=0;
		int b;
		for(int i=1;i<in.length-1;++i) {
			b=Math.max(in[i-1]+in[i], in[i+1]+in[i]);
			if(b>x) {
				if(in[i]<b-x) {
					r+=in[i];
					in[i]=0;
				}else {
					in[i]-=b-x;
					r+=b-x;
				}
			}
		}
		b=in[0]+in[1];
		if(b>x) {
			if(in[0]<b-x) {
				r+=in[0];
				in[0]=0;
			}else {
				in[0]-=b-x;
				r+=b-x;
			}
		}
		b=in[in.length-1]+in[in.length-2];
		if(b>x) {
			if(in[in.length-1]<b-x) {
				r+=in[in.length-1];
				in[in.length-1]=0;
			}else {
				in[in.length-1]-=b-x;
				r+=b-x;
			}
		}
		System.out.println(r);
	}
}