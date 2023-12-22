public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "NO";
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		if((100*r+10*g+b)%4==0) result = "YSE";
		System.out.println(result);
				
	}
}