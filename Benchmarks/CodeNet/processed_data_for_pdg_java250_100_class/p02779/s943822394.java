public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for(int  i=0; i<N; i++) {
			int a= sc.nextInt();
			set.add(Integer.valueOf(a));
		}
		if(set.size()!=N){
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}
