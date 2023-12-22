    import java.util.Scanner;
     
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner in = new Scanner(System.in);
    		long N = in.nextLong();
    		int cShort = String.valueOf(N).length();
    		for (long x = 1; x < Math.sqrt(N); x++) {
    			if (N % x != 0) {
    				continue;
    			} else {
    				int a = x >= N / x ? String.valueOf(x).length() : String.valueOf(N / x).length();
    				cShort = a < cShort ? a : cShort;
    			}
    		}
    		System.out.println(cShort);
    	}
     
    }