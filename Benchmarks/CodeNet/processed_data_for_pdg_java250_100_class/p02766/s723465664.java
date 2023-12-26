public class Main {
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	sc.close();
    	String ans = Integer.toString(n, k);
    	System.out.println(ans.length());
    }
}
