public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> L = new ArrayList<Integer>();
		for(int i = 0; i < N;i++) {
			int num = sc.nextInt();
			L.add(num);
			}
		int max = L.get(0);
		for (int i = 1; i <L.size(); i++) {
		    int v = L.get(i);
		    if (v > max) {
		        max = v;
		    }
		}
		int sum = 0;
		for(int i = 0; i < L.size();i++) {
			sum = sum + L.get(i);
		}
		sum = sum - max;
		if(sum > max) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
