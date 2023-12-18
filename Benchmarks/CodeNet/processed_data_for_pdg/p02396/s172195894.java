public class Main {
public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		for(int i = 1;;i++) {
			int x = s.nextInt();
	if(x!=0) {
		System.out.println("Case "+i+":"+" "+x);
	}
	else break;
		}
		s.close();
}
}
