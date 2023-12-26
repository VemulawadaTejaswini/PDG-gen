public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		long n = scanner.nextLong();
		long a = scanner.nextLong();  
		long b = scanner.nextLong();  
		long count=0;
		long ans=0;
		long m = n/(a+b);
		long l = n%(a+b);
		ans += a * m;
		if(l > a) {
			ans += a;
		}else {
			ans += l;
		}
		System.out.println(ans);
		scanner.close();
	}
}
