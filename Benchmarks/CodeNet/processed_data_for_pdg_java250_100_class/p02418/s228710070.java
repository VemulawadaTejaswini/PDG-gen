public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p=sc.next();
		int n=s.length();
		String x;
		String y;
		for(int i=0;i<=n-1;i++) {
			if(s.indexOf(p)!=-1) {
				System.out.println("Yes");
				break;
			}
			if(i==n-1) {
				System.out.println("No");
			}
			x=s.substring(0,n-1);
			y=s.substring(n-1,n);
			s=y+x;
		}
	}
}
