public class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long d, r;
		double f;
		long a = scan.nextInt();
		int b = scan.nextInt();
		d = a / b;
		r = a % b;
		f = (double)a / b;
		System.out.println(String.format("%d %d %f", d, r, f));
        scan.close();
    }
}
