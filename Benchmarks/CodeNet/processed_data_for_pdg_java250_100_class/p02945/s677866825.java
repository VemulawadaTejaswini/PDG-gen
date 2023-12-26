public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int ans=Math.max(c,Math.max(d,e));
		 System.out.println(ans);
	}
}
