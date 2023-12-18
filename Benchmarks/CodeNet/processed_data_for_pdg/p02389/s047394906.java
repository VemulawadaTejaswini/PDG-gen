public class Main{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String str = a.next();
		int b = Integer.parseInt(str);
	    str = a.next();
	    int c = Integer.parseInt(str); 
		System.out.println(b * c + " " + (2 * c + 2 * b));
	}
}
