public class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		long b = a.nextLong();
		int i=0;
		long total=100;
		while (total<b) {
			long c =  total/100;
			total=total+c;
			i++;
		}
		System.out.println(i);
	}
}
