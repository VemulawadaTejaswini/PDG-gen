import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	long gcd(long a,long b) {
		return a==0?b:gcd(b%a,a);
	}

	void run() {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int K=sc.nextInt();
		long ans=0;
		for (int i=1;i<=K;++i) {
			for (int j=1;j<=K;++j) {
				for (int k=1;k<=K;++k) {
					ans+=gcd(i,gcd(j,k));
				}
			}
		}
		pw.println(ans);
		pw.close();
	} 
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
	
    public static void main(String[] args) {
    	new Main().run();
    }
}
