public class Main {
	public static void main(String[] args)  {
		Set<Integer> d = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		for(int i=0; i < N; i++) {
			int di = sc.nextInt(); 
			d.add(di); 
		}
		sc.close(); 
		System.out.println(d.size());
	}
}
