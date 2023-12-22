import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		String[] tmpArray = input.split(" ");

		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);

		String s = br.readLine();
		String t = br.readLine();

		if(s.charAt(0) != t.charAt(0)){
			System.out.println(-1);
			return;
		}
		
		if(m == n){
			if(s.equals(t)){
				System.out.println(n);
				return;
			}
			else {
				System.out.println(-1);
				return;
			}
		}

		long l = lcm(n, m);
		int g = gcd(n, m);
		
		if(g == 1){
			System.out.println(l);
		}
		else {
//			if(n > m){
//				String tmpS = s;
//				s = t;
//				t = tmpS;
//				
//				n = s.length();
//				m = t.length();
//			}
			
//			System.out.println(s+" "+t);
//			for(long i = 0; i < l; i+=l/n){
//				if(i%m != 0){
//					continue;
//				}
//				
//				System.out.println("i = "+i+" "+s.charAt((int)(i/n)) +" "+ t.charAt((int)(i/m)));
//
//				if(s.charAt((int)(i/n)) != t.charAt((int)(i/m))){
//					System.out.println(-1);
//					return;
//				}
//			}
			int idx1 = (int)(l/m);
			int idx2 = (int)(l/n);
			while(true){
				if(idx1 >= n || idx2 >= m){
					break;
				}
				if(s.charAt(idx1) != t.charAt(idx2)){
//					System.out.println(idx1 +" "+ idx2);
					System.out.println(-1);
					return;
				}
				
				idx1 += (int)(l/m);
				idx2 += (int)(l/n);
			}
			
			System.out.println(l);
		}
	}

	static int gcd(int a, int b){
		int tmp;

		while (a % b != 0)
		{
			tmp = b;
			b = a % b;
			a = tmp;
		}
		return b;
	}

	static long lcm(int a, int b, int gcd){
		return (long)a*(b/gcd);
	}

	static long lcm(int a, int b){
		int g = gcd(a, b);

		return lcm(a,b,g);
	}

}
