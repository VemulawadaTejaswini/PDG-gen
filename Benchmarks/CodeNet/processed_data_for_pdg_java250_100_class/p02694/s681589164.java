public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long temp = 100;
		int count = 0;
		while(true) {
			if(temp >= x) break;
			temp += temp / 100;
			count++;
		}
		System.out.println(count);
	}
}
