public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		String buff= "";
		long count=0,flag=0;
		long count1=0,count2=0;
		int count3=0;
		for(int i=0;i<s.length();i++) {
			if((i+1)%2==0) {
				if((char)s.charAt(i)=='R') {
					System.out.println("No");
					System.exit(0);
				}
			}else {
				if((char)s.charAt(i)=='L') {
					System.out.println("No");
					System.exit(0);
				}
			}
		}
		System.out.println("Yes");
	}
}
