import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		long a1 = 1,b1 = 1;
		for(int i = 0; i < N;++i){
			long a2 = sn.nextLong();
			long b2 = sn.nextLong();
			double ab1 = ((double)a1)/((double)a2);
			double ab2 = ((double)b1)/((double)b2);
			double n = (long)Math.max(Math.ceil(ab1),Math.ceil(ab2));
			a1 = (long)n*(long)a2;                                                    
                        b1 = (long)n*(long)b2;  
			/*System.out.print('(');
			System.out.print(a1);
			System.out.print(',');
			System.out.print(b1);
			System.out.println(')');*/
		}
		System.out.println(a1+b1);
	}
}