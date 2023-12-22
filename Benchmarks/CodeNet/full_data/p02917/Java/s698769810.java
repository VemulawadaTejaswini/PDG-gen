import java.util.*;



class Main {

	//最大公約数・最小公倍数（セットで使う）
static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
static int lcm (int a, int b) {return a*b/gcd(a,b);}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] b = new int[n-1];
		
		for(int i=0;i<n-1;i++){
			b[i] = sc.nextInt();
		}

		int ans = b[0] + b[n-2];
		for(int i=0;i<n-2;i++){
			ans += Math.min(b[i],b[i+1]);
		}
		
		System.out.println(ans);
		}
	}