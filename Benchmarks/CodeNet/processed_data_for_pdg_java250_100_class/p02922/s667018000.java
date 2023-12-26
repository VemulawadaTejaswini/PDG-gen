public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sockets = in.nextDouble();
		double total_req = in.nextDouble();	
		double mid = total_req-sockets;
		if(total_req == 1.0) {
			System.out.println(0);
			System.exit(0);
		}
		double total = Math.ceil(mid/(sockets-1));
		if(sockets>=total_req) {
			System.out.println(1);
			System.exit(0);
		}
		total++;
		System.out.println((int)(total));
	}
}
