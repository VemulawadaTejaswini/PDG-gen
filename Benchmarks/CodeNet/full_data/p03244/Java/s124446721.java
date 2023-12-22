import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] gcnt = new int[100001];
		int[] kcnt = new int[100001];
		int gmax = 0;
		int gmax2 = 0;
		int gid = 0;
		int kmax = 0;
		int kmax2 = 0;
		int kid = 0;
		for(int i = 0; i < n; i++){
			int tmp = sc.nextInt();
			if(i%2==0){
				gcnt[tmp]++;
				if(gmax <= gcnt[tmp]){
					if(tmp != gid)gmax2 = gmax;
					gmax = gcnt[tmp];
					gid = tmp;
				}
			}else{
				kcnt[tmp]++;
				if(kmax <= kcnt[tmp]){
					if(tmp != kid)kmax2 = kmax;
					kmax = kcnt[tmp];
					kid = tmp;
				}
			}
		}
		if(gid != kid){
			System.out.print(n-gmax-kmax);
		}else{
			if(gmax+kmax==n){
				System.out.print(n/2);
			}else if(n-gmax-kmax2 > n-gmax2-kmax){
				System.out.print(n-gmax2-kmax);
			}else{
				System.out.print(n-gmax-kmax2);
			}
		}
	}
}
