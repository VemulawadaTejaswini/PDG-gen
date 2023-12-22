public class Main {
	 public static void main(String[] args) {
		    java.util.Scanner scanner = new java.util.Scanner(System.in);
		    int n = scanner.nextInt();
		    int ninzu = 0;
		    for (int i = 0; i < n; i++) {
		    	int l = scanner.nextInt();
		    	int r = scanner.nextInt();
		    	ninzu = ninzu + (r - l) + 1;
		    }
		    	System.out.println(ninzu);
		 }
}