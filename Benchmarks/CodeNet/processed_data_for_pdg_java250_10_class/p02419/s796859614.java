public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String W=sc.next();
		W=W.toLowerCase();
		int n=W.length();
		int count=0;
		int m=0;
		int o=0;
		while(true) {
			String T=sc.next();
			if(T.equals("END_OF_TEXT")) {
				break;
			}
			T=T.toLowerCase();
			if(W.equals(T)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
