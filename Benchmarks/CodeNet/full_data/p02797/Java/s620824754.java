import java.util.*;

public class Main{
	public static void main(String[] args){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int m=s.nextInt();

		StringJoiner sj=new StringJoiner(" ");
		for(int i=0;i<k;++i)
			sj.add(String.valueOf(m));

		int o=k==1000000000?1:999999999;
		for(int i=k;i<n;++i)
			sj.add(String.valueOf(o));
		System.out.println(sj);
	}
}
