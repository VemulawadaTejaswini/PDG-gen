import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] input = new int[n];
		
		for(int i = 0; i < n; i++){
			input[i] = sc.nextInt();
		}
		
		long lcmAll = input[0];
		
		for(int i = 1; i < n; i++){
			lcmAll = lcm(input[i], lcmAll);
		}
		//debug
//		System.out.println(lcmAll);
		
		long result = 0;
		for(int i = 0; i < n; i++){
			result += (lcmAll - 1)%input[i];
		}
		System.out.println(result);
	}

	static long gcd(long a, long b){
        long tmp;
 
        while (a % b != 0)
        {
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return b;
    }
 
    static long lcm(long a, long b, long gcd){
        return a*(b/gcd);
    }
 
    static long lcm(long a, long b){
        long g = gcd(a, b);
 
        return lcm(a,b,g);
    }
}

