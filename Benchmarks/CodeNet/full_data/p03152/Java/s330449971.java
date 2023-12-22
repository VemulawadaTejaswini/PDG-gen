import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);

		int n=s.nextInt(),m=s.nextInt();
		int[] a=new int[n],b=new int[m];
		int[] f=new int[n*m];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.setAll(b,i->s.nextInt());
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=1;i<n;++i){
			if(a[i]==a[i-1]){
				System.out.println(0);
				return;
			}
		}
		for(int i=1;i<m;++i){
			if(b[i]==b[i-1]){
				System.out.println(0);
				return;
			}
		}

		for(int i=0;i<n;++i){
			for(int j=0;j<m;++j){
				f[i*m+j]=Math.min(a[i],b[j]);
			}
		}

		Arrays.sort(f);

		long c=1;
		loop:
		for(int i=0;i<n;++i){
			for(int j=0;j<m;++j){
				if(a[i]==b[j]){
					b[j]=0;
					continue loop;
				}
			}
			c*=m-~Arrays.binarySearch(b,a[i]);
			c%=1000000007;
		}
		for(int j=0;j<m;++j){
			if(b[j]>0){
				c*=n-~Arrays.binarySearch(a,b[j]);
				c%=1000000007;
			}
		}

		for(int i=1;i<=n*m;++i){
			if(f[i-1]<i){
				System.out.println(0);
				return;
			}
			if(i<n*m&&f[i]==f[i-1]){
				c*=f[i-1]-i;
				c%=1000000007;
			}
		}

		System.out.println(c);
	}
}
