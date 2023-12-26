public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int N = scanner.nextInt();
	    for(int i=0;i<N;i++) {
		    int A = scanner.nextInt();
		    if(A%2==0 && A%3!=0 && A%5!=0) {
	    		System.out.println("DENIED");
	    		System.exit(0);
		    }
	    }
    	System.out.println("APPROVED");
  		scanner.close();
	}
}
