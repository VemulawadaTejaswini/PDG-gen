public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		if(B.substring(0,A.length()). equals (A)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
