import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.math.*;

public class Main {
	
    public static void main(String[] args) {
	FastScanner sc = new FastScanner();
	
	int L = sc.nextInt();
	
	int A[] = new int[L];
	for(int i=0;i<L;i++){
		A[i] = sc.nextInt();
	}
	
	int num = 0;
	int sol =-1;
	
	//前に簡約化
	boolean mikan = true;
	while(mikan){
		int sum = 0;
		
		boolean allmae = true;
		for(int i=1;i<=A[0] && i<A.length;i++){
			if(A[i] != 0){
				allmae = false;
			}
		}
		
		if(allmae){
			if((A.length-A[0]-1) <= 0){
				sol = 0;
			}
			else{
				int B[] = new int[A.length - A[0] - 1];
				for(int i=0; i<B.length; i++){
					B[i] = A[i+A[0]+1];
				}
				A = B;
			}
		}
		
		boolean allusi = true;
		for(int i=1; i<=A[A.length-1] && i<A.length;i++){
			if(A[A.length-1-i] != 0){
				allusi = false;
			}
		}
		
		if(allusi){
			if((A.length - A[A.length-1] - 1) <=0){
				sol = 0;
			}
			else{
				int B[] = new int[A.length - A[A.length-1] - 1];
				for(int i=0; i<B.length; i++){
					B[i] = A[i];
				}
			}
		}
		
		if((allmae || allusi) && sol != 0){
			mikan = true;
		}
		else{
			mikan = false;
		}
	}
	
	if(sol == 0){
		System.out.println(sol);
	}
	else{
		
		int min = Integer.MAX_VALUE;
		
		
		//間が全部奇
		int sum1 = 0;
		for(int i=1; i<=A.length-2; i++){
			if(A[i]%2 ==0){
				sum1 += 1;
			}
		}
		if(sum1 <= min){
			min = sum1;
		}
		
		//全部偶
		int sum2 = 0;
		for(int i=0; i<=A.length-1; i++){
			if(A[i]%2 == 1){
				sum2 += 1;
			}
			else if(A[i] == 0){
				sum2 += 2;
			}
		}
		if(sum2 <= min){
			min = sum2;
		}
		
		//きぐう
		for(int i=1; i<=A.length-2; i++){
			int sum3 = 0;
			for(int j=1; j<=i; j++){
				if(A[j]%2 ==0){
					sum3 += 1;
				}
			}
			for(int j=1+1; j<=A.length-2; j++){
				if(A[j]%2 !=0){
					sum3 += 1;
				}
				else if(A[j] == 0){
					sum3 += 2;
				}
			}
			
			if(sum3 < min){
				min = sum3;
			}
		}
		
		//ぐうき
		for(int i=1; i<=A.length-2; i++){
			int sum3 = 0;
			for(int j=1; j<=i; j++){
				if(A[j]%2 !=0){
					sum3 += 1;
				}
				else if(A[j] == 0){
					sum3 += 2;
				}
			}
			for(int j=1+1; j<=A.length-2; j++){
				if(A[j]%2 ==0){
					sum3 += 1;
				}
			}
			
			if(sum3 < min){
				min = sum3;
			}
		}
		
		
		System.out.println(min);
	}
	
    }
    
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}