public class Main {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int s = num.nextInt();
		int m = num.nextInt();
		int n = num.nextInt();
		int a=s;
		int b,c;
		if(a>=m){
			a=m;
			b=s;
		}
		else{
			b=m;
		}
		if(a>=n){
			c=b;
			b=a;
			a=n;
		}
		else if(a<n && b>=n){
			c=b;
			b=n;
		}
		else{
			c=n;
		}
		System.out.println(a+" "+b+" "+c);
	}
}
