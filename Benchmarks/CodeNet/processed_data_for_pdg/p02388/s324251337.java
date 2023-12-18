public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int x = Integer.parseInt(str);
		int anser = 0;
		double y = (double)x;
		double z = Math.pow(y,3.0);
		anser = (int)z;
		System.out.println( anser );
	}
}
