public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Height = sc.nextInt();
		int Breadth = sc.nextInt();
		int Area  = (Height * Breadth);
		int Periphery = (Height + Breadth) * 2;
		System.out.println(Area + " " + Periphery);
	}
}
