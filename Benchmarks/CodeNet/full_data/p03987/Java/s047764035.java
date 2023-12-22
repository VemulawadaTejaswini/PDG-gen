import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N=Integer.parseInt(s.next());
		int[] perm=new int[N];
		for(int i=0;i<N;i++)
			perm[i]=Integer.parseInt(s.next());
		long res=0;
		for(int i=0;i<N;i++)
		{
			int j=i;
			int min=perm[i];
			while(j<N)
			{
				res=res+min;
				j++;
				if(j==N)
					break;
				min=perm[j]>min?min:perm[j];
			}
		}

		System.out.println(res);
	}

}
