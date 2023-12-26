public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int K = scan.nextInt();
			int []d = new int[K];
			int[][]A = new int[K][N];
			Map<Integer,ArrayList<Integer>>map = new TreeMap<Integer,ArrayList<Integer>>();
			for(int i = 0;i<N;i++) {
				map.put(i,new ArrayList<Integer>());
			}
			for(int i = 0;i<K;i++) {
				d[i] = scan.nextInt();
				for(int j = 0;j<d[i];j++) {
					A[i][j] = scan.nextInt();
					map.get(A[i][j]-1).add(i+1);
				}		
			}
			int count = 0;
			for(int i = 0;i<map.size();i++) {
				if(map.get(i).size()==0)count++;
			}
			System.out.println(count);
		}
	}
}
