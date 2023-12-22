//Meet Arora 2016055

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.*;
import java.awt.Point;

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /**
     * call this method to initialize reader for InputStream
     */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    /**
     * get next word
     */
    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(
                    reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}

public class Main {
	public static void bitwise_and(int[] a, int[] b, int[] temp) {
		for(int i=0;i<32;i++) {
			if(a[i]==0 || b[i]==0)
				temp[i] = 0;
			else
				temp[i] = 1;
		}
	}

	public static void bitwise_sum(int[] a, int[] temp) {
		int carry = 0;

		for(int i=31;i>=0;i--) {
			int sum = a[i] + temp[i] + carry;
			if (sum==2) {
				a[i] = 0;
				carry = 1;
			}
			else if(sum==3) {
				a[i]=1;
				carry = 1;
			}
			else if(sum==1) {
				a[i]=1;
				carry =0;
			}
			else if(sum==0) {
				a[i]=0;
				carry=0;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Reader.init(System.in);
		int n=Reader.nextInt();
		int m = Reader.nextInt();
		int k = Reader.nextInt();
		String s = Reader.next();
		String t = Reader.next();

		char[] a = s.toCharArray();
		char[] b = t.toCharArray();

		int[] ai = new int[32];
		int[] bi = new int[32];

		for(int i=0;i<n;i++) {
			ai[31-i] = Character.getNumericValue(a[n-1-i]);
		}
		for(int i=0;i<m;i++) {
			bi[31-i] = Character.getNumericValue(b[m-1-i]);
		}

		for(int i= 0;i<k;i++) {
			int[] temp = new int[32];
			bitwise_and(ai, bi, temp);
			bitwise_sum(ai, temp);
			bitwise_sum(bi, temp);
		}

		String s_a = "";
		String s_b = "";

		int flag = 0;
		for(int i=0;i<32;i++) {
			if(ai[i]==1)
				flag = 1;
			if (flag==1)
				s_a+= String.valueOf(ai[i]);
		}

		 flag = 0;
		for (int i = 0; i < 32; i++) {
			if (bi[i] == 1)
				flag = 1;
			if (flag == 1)
				s_b += String.valueOf(bi[i]);
		}

		System.out.println(s_a);
		System.out.println(s_b);
	}
}