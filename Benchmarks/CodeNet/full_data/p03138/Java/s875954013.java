import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int xor0 = 0;
		int[] dp = new int[1+k];
		List<Integer> list = new ArrayList<>();
		List<Pair> pairs = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}

		for(int l:list) {
			xor0 = xor0 + xor(0,l);
		}

		for(int i=1;i<k;i=i*2) {
			int sum = 0;
			for(int l:list) {
				sum = sum + xor(i,l);
			}
			pairs.add(new Pair(i, sum));
		}
		dp[0]= xor0;
		for(int i=1;i<=k;i++) {
			int tmp = i;
			dp[i]=xor0;
			for(int j=0;Math.pow(2, j)<=k;j++) {
				if((tmp/Math.pow(2, j))%2==1) {
					dp[i] = dp[i]+pairs.get(j).b-xor0;
				}
			}
		}
		int ans = 0;
		for(int d:dp) {
			ans = ans>d?ans:d;
		}
		sc.close();
		System.out.println(ans);
		//一つ目足した結果
	}

	static int xor(int a,int b) {
		int c = a>b?a:b;
		int sum = 0;
		for(int i=1;i<=c;i=i*2) {
			if(a%2!=b%2) {
				sum = sum + i;
			}
			a = a/2;
			b = b/2;
		}
		return sum;
	}

	static class Pair implements Comparable<Pair> {
	    int a,b;
	    public Pair(int a,int b) {
	        this.a = a;
	        this.b = b;
	    }

	    //(a,b)が一致
	    @Override
	    public boolean equals(Object o) {
	        if (o instanceof Pair) {
	            Pair p = (Pair) o;
	            return a == p.a && b == p.b;
	        }
	        return super.equals(o);
	    }

	    /*
	     * x.equals(y) ならば hashCode(x) == hashCode(y)でなければならない。
	     * この実装では同じハッシュ値をもつペアを容易に見つけられるため、ハッシュとしては弱い。
	     */
	    @Override
	    public int hashCode() {
	        return a ^ b;
	    }

	    //辞書順比較
	    @Override
	    public int compareTo(Pair o) {
	        if (a != o.a) {
	            return Integer.compare(a, o.a);
	        }
	        //変えた
	        return Integer.compare(b, o.b);
	    }
	}

}
