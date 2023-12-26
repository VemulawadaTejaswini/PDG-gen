public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] m = new int[n];
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = 0; i < n; i++){
		    m[i] = sc.nextInt();
		    sum += m[i];
		    min = min(min, m[i]);
		}
		int result = n;
		result += (x - sum)/min;
		System.out.println(result);
	}
}
