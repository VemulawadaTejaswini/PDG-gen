public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int i = 0; 
		int j = 0; 
		i = x; 
		j = y; 
		x = y; 
		y = i; 
		x = z; 
		z = j; 
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
	}
}
