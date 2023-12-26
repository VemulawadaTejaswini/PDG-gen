public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();  
		HashSet<String> kuji = new HashSet<String>();
		for(int i=0 ; i<times ; i++) {
			kuji.add(sc.next());
		}
		System.out.print(kuji.size());
		sc.close();
	}
}
