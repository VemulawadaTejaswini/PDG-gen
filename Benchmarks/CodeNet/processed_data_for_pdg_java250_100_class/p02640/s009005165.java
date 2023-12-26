public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();		
		int y=sc.nextInt();		
		if(y%2==1||x*4<y||x*2>y) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		sc.close();
	}
}
