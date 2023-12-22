import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    static StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));  
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));  
      
    public static int nextInt()throws IOException {in.nextToken();return (int)in.nval;}  
    public static long nextLong()throws IOException {in.nextToken(); return (long)in.nval;}
    public static String next()throws IOException {in.nextToken();return (String)in.sval;}

	static int[] a = new int[200100];
	static int[] num = new int[200100];
	static int[] b = new int[200100];
	static long[] sum = new long[200100];
	static long[] c = new long[200100];

    public static void main(String[] args) throws IOException {
    	int n = nextInt(), k = nextInt();
    	num[1] = 1;
    	for (int i = 2; i <= n + 1; i++) {
    		sum[i] = sum[i - 1] + nextInt() - k;
    		num[i] = i;
    	} 
    	qsort(1, n + 1);
    	for (int i = 1; i <= n + 1; i++)
    		b[num[i]] = i;
    	long ans = 0;
    	for (int i = 1; i <= n + 1; i++) {
			int p = b[i];
			while (p > 0) {
				ans += c[p];
				p -= lowbit(p);
			}
			p = b[i];
			while (p <= n + 1) {
				c[p]++;
				p += lowbit(p);
			}
		}
    	out.println(ans);
    	out.flush();
    	out.close();
    }
    public static int lowbit(int x) {
    	return x & -x;
    }
    public static void qsort(int s, int t) {
    	long x = sum[(s + t) / 2];
    	int y = num[(s + t) / 2];
    	int i = s, j = t;
    	while (i < j) {
    		while (sum[i] < x || sum[i] == x && num[i] < y) i++;
    		while (sum[j] > x || sum[j] == x && num[j] > y) j--;
    		if (i <= j) {
    			long k = sum[i];
    			sum[i] = sum[j];
    			sum[j] = k;
    			int p = num[i];
    			num[i] = num[j];
    			num[j] = p;
    			i++;
    			j--;
    		}
    	}
    	if (i < t) qsort(i, t);
    	if (s < j) qsort(s, j);
    }
}
