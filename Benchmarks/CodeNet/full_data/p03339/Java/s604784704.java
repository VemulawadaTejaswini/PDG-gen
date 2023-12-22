import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),t,m=Integer.MAX_VALUE,te[]=new int[300000],tw[]=new int[300000],i;
		String s=new String();
		s=sc.next();
		sc.close();
		if(s.charAt(0)=='E') te[0]++;
		else tw[0]++;
		for(i=1;i<n;i++) {
			if(s.charAt(i)=='E') {
				te[i]=te[i-1]+1;
				tw[i]=tw[i-1];
			}
			else {
				te[i]=te[i-1];
				tw[i]=tw[i-1]+1;
			}
		}
		for(i=0;i<n;i++) {
			t=te[n-1]-te[i];
			if(i>0) t+=tw[i-1];
			if(m>t) m=t;
		}
		System.out.print(m);
	}
}