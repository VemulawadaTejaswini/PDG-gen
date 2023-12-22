import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		boolean ok=true;
		int okcnt=0;
		int ans=0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		while(ok==true) {
			
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				okcnt++;
			}
		}
		if(okcnt==n) {
			ok=true;
			for(int i=0;i<a.length;i++) {
				a[i]=a[i]/2;
			}
			ans++;
			okcnt=0;
		}else {
			ok=false;
			break;
		}
		
		}
		System.out.println(ans);
	}

}
