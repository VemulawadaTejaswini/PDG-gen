public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String result = "Odd";
		if(a*b%2 == 0) result = "Even";
		System.out.println(result);
	}
}
