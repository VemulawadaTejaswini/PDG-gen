public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] a = sc.next().toCharArray();
		int b = 0;
		int c = 0;
		for(int i = 0; i <= a.length-1; i+=2) {
			if(a[i]=='L'){
				System.out.println("No");
				System.exit(0);
			}
		}
		for(int j = 1; j <= a.length-1; j+=2) {
			if(a[j]=='R') { 
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}
