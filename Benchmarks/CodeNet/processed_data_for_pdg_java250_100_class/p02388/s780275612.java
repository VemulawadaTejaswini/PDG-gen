public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int intA = sc.nextInt();
		double dbAncer = Math.pow(intA, 3);
		int intAncer = (int)dbAncer;
		System.out.println(intAncer);
	}
}
