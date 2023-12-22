import java.util.LinkedList;
import java.util.Scanner;

class Main {
	int a,b,c,d,e,f;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
	}

	void solve() {
		double max = 0;
		int water = 100 * a;
		int sugar = 0;
		for(int i=1;100*a*i<=f;i++){
			for(int j=0;100*b*j+100*a*i<=f;j++){
				for(int k=0;k*c<=(b*j+a*i)*e&&100*b*j+100*a*i+k*c<=f;k++){
					int l = Math.min((f-(100*b*j+100*a*i+k*c))/d, ((b*j+a*i)*e-k*c)/d);
					double n = 100.0*(k*c+l*d) / (k*c+l*d+100*b*j+100*a*i);
					//System.out.printf("水:%d 砂糖：%d 濃度:%f\n",100*b*j+100*a*i,k*c+l*d,n);
					if(n > max){
						max = n;
						water = 100*b*j+100*a*i;
						sugar = k*c+l*d;
					}
				}
			}
		}
		System.out.println((sugar+water)+" "+sugar);
	}
}