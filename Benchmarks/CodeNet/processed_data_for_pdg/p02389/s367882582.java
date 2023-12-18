public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(1<=a && b <= 100){
			int area = a*b;
			int perimeter = (a+b)*2;
			System.out.println(area + " " + perimeter);
		}
		sc.close();
	}
}
