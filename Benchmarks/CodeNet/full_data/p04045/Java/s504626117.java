import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int hako[] = new int[k];
		int ans=0;
		for(int i=0;i<k;i++) {
			hako[i] = sc.nextInt();
		}
		//1000
		for(int i=0;i<10;i++) {
			for(int j=0;j<k;j++) {
				if(i==hako[j] && i<(n/1000)) {
					break;
				}
			}
			ans+=1000*i;
		}
		//100
		for(int i=0;i<10;i++) {
			for(int j=0;j<k;j++) {
				if(i==hako[j] && i<((n-ans)/100)) {
					break;
				}
			}
			ans+=100*i;
		}
		//10
		for(int i=0;i<10;i++) {
			for(int j=0;j<k;j++) {
				if(i==hako[j] && i<((n-ans)/10)) {
					break;
				}
			}
			ans+=10*i;
		}
		//1
		for(int i=0;i<10;i++) {
			for(int j=0;j<k;j++) {
				if(i==hako[j] && i<((n-ans)/1)){
					break;
				}
			}
			ans+=1*i;
		}
		
		System.out.println(ans);
	}
}
