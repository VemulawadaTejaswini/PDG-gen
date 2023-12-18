public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ;
		int cnt = 1;
		while(true) {
			a = sc.nextInt();
			if (a!=0) {
				System.out.println("Case "+cnt+": "+a);
			}else {
				break;
			}
			cnt++;
		}
	}
}
