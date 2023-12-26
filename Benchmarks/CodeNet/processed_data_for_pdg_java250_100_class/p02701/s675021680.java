public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();  
		List<String> kuji = new ArrayList<String>();
		for(int i=0 ; i<times ; i++) {
			kuji.add(sc.next());
		}
		HashSet<String> result = new HashSet<String>(kuji);
		System.out.print(result.size());
		sc.close();
	}
}
