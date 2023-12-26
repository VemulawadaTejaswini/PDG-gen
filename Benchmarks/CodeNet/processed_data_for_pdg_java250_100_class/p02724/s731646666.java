public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int X =sc.nextInt();
		long sum = 0;
		long remain_1 = 0;
		long quo_1 = 0;
		long quo_2 = 0;
		quo_1=X/500;
		remain_1 = X%500;
		quo_2=remain_1/5;
		sum=(quo_1*1000)+(quo_2*5);
		System.out.println(sum);
    }
}
