import java.util.*;
public class Main{
	public static void main(String[]$){
		Scanner c=new Scanner(System.in);
		int n=c.nextInt(),i=4,j,k;
		String s=c.next();
		while(i-->0){
			boolean[]a=new boolean[n+2];
			a[0]=(i&1)==0;
			a[1]=(i&2)==0;
			j=k=0;
			while(j<n)a[j+2]=s.charAt(j)=='o'^a[j]^a[++j];
			if(a[0]==a[n]&&a[1]==a[n+1]){
				while(k<n)System.out.print(a[++k]?'S':'W');
				System.out.println();
				return;
			}
		}
		System.out.println(-1);
	}
}