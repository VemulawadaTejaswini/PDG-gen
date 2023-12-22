public class Main {
	static int lowestNum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int[] frog = new int[n];
		Arrays.fill(frog,  Integer.MAX_VALUE);
		
		frog[0] = 0;
		for (int i = 0; i < n; i++) {
			if (frog[i] == Integer.MAX_VALUE)
				continue;
			if (i+1 < n) {
				frog[i+1] = Math.min(frog[i+1], frog[i] + Math.abs(arr[i+1]-arr[i]));
			}
			if (i+2 < n) {
				frog[i+2] = Math.min(frog[i+2], frog[i] + Math.abs(arr[i+2] - arr[i]));
			}
		}
		System.out.println(frog[n-1]);
		/*
		lowestNum = Integer.MAX_VALUE;
		int[] memo = new int[n];
		for (int i = 0; i < n; i++)
			memo[i] = -1;
		
		System.out.println(frog(arr, arr.length - 1, 0, memo));
		*/
	}
	
	
	
	public static int frog(int[] arr, int pos, int totalCost, int[] memo) { // pos 0 - indexed
		if (pos == 0)
			return totalCost;
		if (pos == 1)
			return totalCost + Math.abs(arr[1] - arr[0]);
		if (memo[pos] != -1)
			return memo[pos];
		
		int cost1 = frog(arr, pos - 1, totalCost + Math.abs(arr[pos] - arr[pos-1]), memo);
		int cost2 = frog(arr, pos - 2, totalCost + Math.abs(arr[pos] - arr[pos-2]), memo);
		
		memo[pos] = Math.min(cost1, cost2);
		return Math.min(cost1, cost2);
	}
}
