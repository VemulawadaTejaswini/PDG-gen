public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int a = Integer.parseInt(s);
         s = scan.next();
        int b = Integer.parseInt(s);
        if (a > b){
        	System.out.println("a > b");
        }
        if (a < b){
        	System.out.println("a < b");
        }
        if (a == b){
        	System.out.println("a == b");
        }
	}
}
