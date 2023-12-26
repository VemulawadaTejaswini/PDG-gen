public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int count500 = 0;
		while(total >= 500) {
			total -= 500;
			count500++;
		}
		int count5 = 0;
		while(total >= 5){
			total -= 5;
			count5++;
		}
		System.out.print(count500*1000 + count5*5);
	}
}
