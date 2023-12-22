import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = as.nextInt();
		int[] a;
		a = new int[n];
		long t = 0;
		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(as.next());
			t+=a[i];
		}
		long k=0;
		if(t%((n+1)*n/2)==0){
			k=t/((n+1)*n/2);
		}else{
			System.out.println("NO");
			System.out.flush();
		}
		int l=a[0]-a[n-1];
		int m=0;
		int mm=0;
		int lk;
		for(int i=1;i<n;i++){
			lk = a[i]-a[i-1];
			if(l==lk||m==lk||mm==lk){
			}else if(m==0){
				m = lk;
			}else if(m!=0&&mm==0){
				mm = lk;
			}else{
				System.out.println("NO");
				System.out.flush();
			}
		}
		boolean asa = true;
		if(k%n>n-4){
			if(mm!=0){
				asa = false;
			}
		}else{
			if(m!=0&&mm==0){
				asa = false;
			}
		}
		if(asa){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}