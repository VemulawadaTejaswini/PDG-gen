import java.util.Scanner;

 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans[] = {111,222,333,444,555,666,777,888,999};
		int val=111;
		for(int i=1;i<ans.length;i++) {
			if(n==ans[i]) {
				val=ans[i];break;
			} else
			if(ans[i-1]<n && ans[i]>=n) {
				val=ans[i];break;
			}
				
		}
		System.out.println(val);
	}
}
