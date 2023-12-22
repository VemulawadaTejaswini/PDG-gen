import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long d = sc.nextLong();
		long a = sc.nextLong();
		long[][] m = new long[n][2];
		for(int i = 0; i < n; i++){
		    m[i][0] = sc.nextLong();
		    m[i][1] = sc.nextLong();
		}
		Arrays.sort(m, (s, t) -> Long.compare(s[0], t[0]));
		Integer[] x = new Integer[n];
		for(int i = 0; i < n; i++){
		    x[i] = (int)m[i][0];
		}
		
		// 計算
		long result = 0;
		BIT bit = new BIT(n, 2);
		for(int i = 0; i < n; i++){
		    long remain = m[i][1] - bit.get(i);
		    if(remain <= 0) continue;
		    long cnt = (remain + a - 1)/a;
		    result += cnt;
		    long damage = cnt*a;
		    int index = upperBound(x, (int)min(x[i]+2*d, Integer.MAX_VALUE)) - 1;
		    bit.add(i, index, damage);
		}
		
		// 出力
		System.out.println(result);
	}
	
	static int upperBound(Integer[] array, int n){
		int index = ~Arrays.binarySearch(array, n, (x,y) -> x.compareTo(y) > 0 ? 1 : -1);
		return index;
	}
}

class BIT {
    int n;
    long[] array;
    int mode = 1;
    
    public BIT(int n){
        this.n = n;
        this.array = new long[n+1];
    }
    
    public BIT(int n, int mode){
        this.n = n;
        this.array = new long[n+1];
        this.mode = mode;
    }
    
    public void init(long[] a){
        for(int i = 0; i < n; i++){
            add(i, a[i]);
        }
    }
    public void init(int[] a){
        for(int i = 0; i < n; i++){
            add(i, a[i]);
        }
    }

    public void add(int i, long a){
        switch(mode){
            case 1:
                for(i++; i < array.length; i += i&-i){
                    array[i] += a;
                }
                break;
                
            case 2:
                add(i, i, a);
                break;
                
            default:
        }
    }
    
    public void add(int from, int to, long a){ // mode 2 only
        switch(mode){
            case 1:
                break;
                
            case 2:
                int i = from;
                for(i++; i < array.length; i += i&-i){
                    array[i] += a;
                }
                i = to + 1;
                for(i++; i < array.length; i += i&-i){
                    array[i] -= a;
                }
                break;
                
            default:
        }
    }
    
    public long get(int i){
        switch(mode){
            case 1:
                return getSum(i, i);
            case 2:
                return getSum(i);
            default:
                return getSum(i, i);
        }
    }
    
    public long getSum(int i){ // mode 1 only
        long r = 0;
        for(i++; i > 0; i -= i&-i){
            r += array[i];
        }
        return r;
    }
    
    public long getSum(int from, int to){ // mode 1 only
        return getSum(to) - getSum(from - 1);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < n; i++){
            sb.append(get(i));
            if(i != n-1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}


