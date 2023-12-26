public class Main {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int x=scn.nextInt();
		for(int i=x-n+1;i<=x+n-1;i++) {
			System.out.print(i+" ");
		}
	}
}
