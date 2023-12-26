public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Set<Integer>array=new HashSet<>();
		for(int i=0;i<n;i++) {
			array.add(sc.nextInt());
		}
		if(n<=array.size()) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();	
	}
}
