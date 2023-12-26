public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count = 0;
		for(int i = a; i <= b; i++){
			if(i > c) break;
			if(c % i == 0) count++;
		}
		System.out.println(count);
	}
}
