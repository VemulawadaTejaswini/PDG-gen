import java.util.Scanner;

/**
 * https://abc046.contest.atcoder.jp/tasks/arc062_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Fraction[] fractions = new Fraction[N];
		for(int i=0; i<N; i++){
			fractions[i] = new Fraction(sc.nextInt(), sc.nextInt());
		}
		sc.close();
		
		long t = fractions[0].t;
		long a = fractions[0].a;
		for(int i=1; i<N; i++){
			Fraction f = fractions[i];
			if(f.t==f.a){
				long tmp = Math.max(t, a);
				a = t = tmp;
			}else if(f.t<f.a){
				while(a%f.a!=0 || t>(a/f.a)*f.t){
					a++;
				}
				t = (a/f.a)*f.t;
			}else{
				while(t%f.t!=0 || a>(t/f.t)*f.a){
					t++;
				}
				a = (t/f.t)*f.a;
			}
		}
		System.out.println(t+a);

	}
	
	static class Fraction{
		int t;
		int a;		
		Fraction(int t, int a){
			this.t = t;
			this.a = a;
		}
	}

}
