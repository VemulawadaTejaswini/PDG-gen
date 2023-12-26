public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int[] ary = new int[times];
		for(int i=0; i<times; i++) {
			ary[i] = sc.nextInt();
		}
		long max = ary[0];
		long min = ary[0];
		long sum = 0;
		for(int i=0; i<times; i++) {
			int v =ary[i];
			if(max > v) {
				max = v;
			}else if(min < v) {
				min = v;
			}
			sum = sum + v;
		}
		System.out.println(max +" "+ min +" "+ sum);
	}
}
