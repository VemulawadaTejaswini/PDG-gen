import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}

	static String P="POSSIBLE",I="IM"+P;

	public static void main(String[]$){
		int n=getInt(),k=getInt(),a[]=INS(n).sorted().toArray();

		if(a[n-1]<k) {
			System.out.println(I);
			return;
		}

		if(Arrays.stream(a).allMatch(i->i%a[0]==0)) {
			System.out.println(k%a[0]==0?P:I);
		}else {
			int mod=a[0];
			for(int i:a) {
				if(i%mod!=0)
					mod=Math.min(mod,i%mod);
			}
			System.out.println((a[n-1]-k)%mod==0?P:I);
		}
	}
}
