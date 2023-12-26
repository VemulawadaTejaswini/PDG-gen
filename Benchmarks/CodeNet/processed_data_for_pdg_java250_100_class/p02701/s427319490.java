public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		ArrayList<String>array=new ArrayList<String>();
		for(int i=0;i<n;i++) {		
			array.add(sc.next());
		}
		HashSet<String>keihin=new HashSet<String>(array);
		System.out.println(keihin.size());
		sc.close();
	}
}
