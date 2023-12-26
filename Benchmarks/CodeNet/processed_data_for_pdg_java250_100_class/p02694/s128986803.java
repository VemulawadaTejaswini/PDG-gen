public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = Long.parseLong(sc.next());
		long money = 100;
		int year = 0;
		while(money < x){
			money = (long) (money * 1.01);
			year++;				
		}
		System.out.println(year);
	}
}
