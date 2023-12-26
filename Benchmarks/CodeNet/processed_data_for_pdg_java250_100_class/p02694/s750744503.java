public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long rishi = 100;
		long count = 0;
		while(rishi<X) {
			rishi = (long) Math.floor(rishi*1.01);
			count ++;
		}
		System.out.println(count);
		}
	}
