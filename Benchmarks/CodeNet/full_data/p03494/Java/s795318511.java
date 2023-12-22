import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int numbers[] =new int[n];
		for (int i=0 ; i < n; i++) {
			numbers[i] =sc.nextInt();
		}
		sc.close();

		int ans = 0;
		boolean flag=true;

		while (flag){
			for(int i=0 ; i<n ;i++){
				if(numbers[i]%2==1){
					flag = false;
					break;
				} else {
					numbers[i] = numbers[i]/2;
				}
			}
			if (flag) {
				ans++;
			}
		}
		System.out.println(ans);


	}
}
