public class Main{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		out.printf("%.8f",(double)(n - n / 2) / (double)n);
	}
}
