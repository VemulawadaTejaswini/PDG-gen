import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int n=stdin.nextInt();
		int i,j,k;
		int point=0;
		int index=n;
		int sum[]=new int[n+1];
		String s[]=new String [n];
		for(i=0;i<n;i++)
			s[i]=stdin.next();
		int m=stdin.nextInt();
		String t[]=new String[m];
		for(i=0;i<m;i++)
			t[i]=stdin.next();

		String takahashi;
		for(i=0;i<n;i++){
			takahashi=new String (s[i]);
			point=0;
			for(j=0;j<n;j++)
				if(takahashi.equals(s[j]))
					point++;
			for(k=0;k<m;k++)
				if(takahashi.equals(t[k]))
					point--;
//			System.out.println("point="+point);
					sum[i]=point;
		}
		int max=0;
		for(i=0;i<=n;i++)
			if(max<sum[i]){
				max=sum[i];
				index=i;
			}
		if(index==n)
			System.out.println(0);
		else
			System.out.println(max);
	}
}
