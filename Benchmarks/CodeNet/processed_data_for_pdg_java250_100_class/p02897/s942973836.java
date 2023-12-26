public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double num = sc.nextInt();
		double odd = Math.ceil(num/2);
		double result = odd / num;
		System.out.println(result);
		sc.close();
	}
}
