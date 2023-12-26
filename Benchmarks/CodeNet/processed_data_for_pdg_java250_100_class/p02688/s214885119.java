public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		ArrayList<Integer>array=new ArrayList<>();
		for(int i=0;i<K;i++) {
			int	d=sc.nextInt();
			for(int j=0;j<d;j++) {
				int checkint=sc.nextInt();
				if(!array.contains(checkint)) {
					array.add(checkint);
				}
			}
		}
		System.out.println(N-array.size());
	}
}
