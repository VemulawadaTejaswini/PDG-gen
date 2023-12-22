import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		int cnt = 0, an = 0;
		boolean sw = true;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		while(sw == true){
			for(int i = 0; i < n; i++){
				if(a[i]%2==0){
					cnt++;
					a[i] = a[i] / 2;
					System.out.println(a[i]);
				}
			}
			if(cnt==n){
				an++;
				cnt = 0;
			} else {
				sw = false;
				break;
			}
		}
		System.out.println(an);
	}
}

