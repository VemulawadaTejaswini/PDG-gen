public class Main {
	public static void main(String[] args) {
		Scanner cd = new Scanner(System.in);
		String a = cd.next();
		String b = cd.next();
		int n = Integer.parseInt(a+b);
		int k =0;
		for(int i=1;i<n;i++) {
			if(n==i*i) k=n;
		}
		if(k>0)System.out.println("Yes");
		if(k==0)System.out.println("No");
	}
}
