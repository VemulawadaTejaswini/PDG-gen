public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int Area = a * b;
		int periphery = (a + b) * 2; 
		System.out.println(Area + " " + periphery);
	}
}
