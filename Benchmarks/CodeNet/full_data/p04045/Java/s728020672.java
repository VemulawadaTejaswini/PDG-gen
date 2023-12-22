import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int hako[] = new int[k];
		int ans=0;
		int i=0;
		
		for(i=0;i<k;i++) {
			hako[i] = sc.nextInt();
		}
		//1000
		for(i=0;i<10;i++) {
			for(int j=0;j<k;j++) {
				if(i==hako[j] && i<(n/1000)) {
					break;
				}
			}
			if(i>=(n/1000) && n%1000==0) {
				break;
			}
			else if(i>(n/1000)) {
				break;
			}
		}
		n-=1000*i;
		ans+=1000*i;
		//100
		for(i=0;i<10;i++) {
			for(int j=0;j<k;j++) {
				if(i==hako[j] && i<((n-ans)/100)) {
					break;
				}
			}
			if(i>=(n/100) && n%100==0) {
				break;
			}
			else if(i>(n/100)) {
				break;
			}
		}
		n-=100*i;
		ans+=100*i;
		//10
		for(i=0;i<10;i++) {
			for(int j=0;j<k;j++) {
				if(i==hako[j] && i<((n-ans)/10)) {
					break;
				}
			}
			if(i>=(n/10) && n%10==0) {
				break;
			}
			else if(i>(n/10)) {
				break;
			}
		}
		n-=10*i;
		ans+=10*i;
		//1
		for(i=0;i<10;i++) {
			for(int j=0;j<k;j++) {
				if(i==hako[j] && i<((n-ans)/1)){
					break;
				}
			}
			if(i>=n) {
				break;
			}
		}
		ans+=1*i;
		System.out.println(ans);
	}
}
