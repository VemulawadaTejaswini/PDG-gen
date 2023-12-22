import java.util.*;
class Main {
  
static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
static int lcm (int a, int b) {return a*b/gcd(a,b);}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int ans = lcm(a,b); 	
      	
      System.out.println(ans);
		}
	}