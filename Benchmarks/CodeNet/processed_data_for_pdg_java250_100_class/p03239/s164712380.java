public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int tmp = 9999;
		int min = 9999;
		int[] ci = new int[n];
		int[] ti = new int[n];
		int i = 0;
		for (i = 0; i < n; i++){
			ci[i] = sc.nextInt();
			ti[i] = sc.nextInt();
			if (ti[i] <= t){
				tmp = ci[i];
				if (min > tmp){
					min = tmp;
				}
			}
		}
		if (min < 9999){
			System.out.println(min);
		} else {
			System.out.println("TLE");
		}
	}
}
