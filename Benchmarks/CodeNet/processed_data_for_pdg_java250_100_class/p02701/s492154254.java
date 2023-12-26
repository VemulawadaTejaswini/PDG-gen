public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    String input2 = scanner.next();
	    int n=Integer.parseInt(input2);
	    Set<String> sa=new HashSet<String>();
	    for(int i=0;i<n;i++) {
	    	sa.add(scanner.next());
	    }
	    scanner.close();
	    System.out.println(sa.size());
	}
}
