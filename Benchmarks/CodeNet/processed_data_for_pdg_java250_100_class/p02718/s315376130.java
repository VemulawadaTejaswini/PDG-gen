public class Main {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int sum = 0;
	        int cnt = 0;
	        int[] all = new int[n];
	        for(int i = 0 ; i<n; i++) {
	        	all[i] = sc.nextInt();
	        	sum += all[i];
	        }
	        for(int i = 0 ; i<n; i++) {
	        	if(all[i]*4*m >= sum) {
	        		cnt++;
	        	}
	        }
	        if(cnt >= m)  System.out.println("Yes");
	        else System.out.println("No");
	}
}
