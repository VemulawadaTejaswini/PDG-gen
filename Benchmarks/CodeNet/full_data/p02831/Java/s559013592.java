import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
      
      	System.out.println(lcm(a, b));
    }
  	
  	public static int lcm(int a, int b) {
    	int g = gcd(a, b);
      	return g * (a / g) * (b / g);
    }
  
  	public static int gcd(int a, int b) {
    	if (a > b) {
        	int tmp = a;
          	a = b;
          	b = tmp;
        }
      	if (a == 0) { return b; }
      	return gcd(b % a, a);
    }
}