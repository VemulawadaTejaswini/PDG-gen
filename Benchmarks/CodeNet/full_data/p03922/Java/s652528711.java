import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[n];
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
		}
		sc.close();
		
		int[] rem = new int[n];
		int[] num = new int[m];
		int[] same = new int[100000 + m + 100];
		for(int i=0; i<n; i++){
			rem[i] = x[i]%m;
		}
		
		int ans = 0;
		
		for(int i=0; i<n; i++){
			num[rem[i]]++;
			same[x[i]]++;
		}
		ans += num[0]/2;
		for(int i=1; i<=(m-1)/2; i++){
			ans += Math.min(num[i], num[m-i]);
			int nsam = (Math.max(num[i], num[m-i]) - Math.min(num[i], num[m-i])) / 2;
			int p = 0;
			while(nsam > 0){
				if(same[p*m + i] >= 2){
					ans += Math.min(nsam, same[p*m+i]/2);
					nsam -= same[p*m+i]/2;
				}
				p++;
				if(p*m > 100000){
					break;
				}
			}
		}
		if(m%2 == 0){
			ans += num[m/2]/2;
		}
		
		System.out.println(ans);

	}

}