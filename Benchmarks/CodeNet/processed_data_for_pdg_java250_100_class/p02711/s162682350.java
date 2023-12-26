public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String s = String.valueOf(N);
    	boolean flag = s.contains("7");
    	if(flag) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }
}
