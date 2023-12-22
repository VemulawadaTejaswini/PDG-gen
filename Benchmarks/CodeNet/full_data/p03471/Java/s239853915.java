public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println(Main.calc(s.nextInt(), s.nextInt()));
	}
	public static String calc(int n,int y) {
		for(int i=0;i<=n;i++) {
			for(int j=0;i+j<=n;j++) {
				int k = n-(i+j);
				if(i+j+k==n && i*10000+j*5000+k*1000==y) {
					return i+" "+j+" "+k;
				}
			}
		}
		return "-1 -1 -1";
	}
}