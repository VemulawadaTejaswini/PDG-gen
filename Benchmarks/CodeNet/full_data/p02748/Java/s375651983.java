import static java.util.Arrays.*;
import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int A=s.nextInt(),B=s.nextInt(),n=s.nextInt();
		int[]a=new int[A],b=new int[B];
		setAll(a,i->s.nextInt());
		setAll(b,i->s.nextInt());

		int r=stream(a).min().getAsInt()+stream(b).min().getAsInt();
		for(int i=0;i<n;++i)
			r=Math.min(r,a[s.nextInt()-1]+b[s.nextInt()-1]-s.nextInt());
		System.out.println(r);
	}
}
