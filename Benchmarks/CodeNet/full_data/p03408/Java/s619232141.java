import java.util.*;
import java.util.Map.Entry;
 
 
 
public class Main{
	
	
	
	public static long A;
	public static long answer = 0;
	

 
	
	//最大公約数・最小公倍数（セットで使う）
	public static long gcm(long a, long b) {
		long result = a;
		long k = 0;
		long n = b;
		do {
			k = result % n;
			result = n;
			n = k;
		} while(k != 0);
		return result;
	}
	
	public static long lcm(long a, long b) {
		long g;
		g = gcm(a, b);
		return a/g*b;
	}
	
	static long gcd(long a, long b) {
		if (b == 0) {
			return a;			
		}
		return gcd(b, a % b);
	}
	
	//等差数列
	static long tousasum(int n) {
		return (long)n*((long)n+1)/2;
	}
 
 
 
	//素数判定
	static boolean isPrime (int n) {
		if (n==2) return true;
		if (n<2 || n%2==0) return false;
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
		return true;
	}
 
 
	//倍数判定（10進数以外のときに有用）
	static boolean isMultiple (String s, int base, int m) {
		int temp = 0;
		for (int i=0; i<s.length(); i++) {
			temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
		}
		if (temp==0) {return true;}
		return false;
	}
 
 
	//階乗
	static long factorial (int i) {
		if (i==1) {return 1;}
		else {return i*factorial(i-1);}
	}
 
 
	//進数変換
	static String toNbase (String sm, int m, int n) {
		return Long.toString(Long.parseLong(sm,m),n);
	}
	
	public static final long gcd_n(long[] param) {
	    final int len = param.length;
	    long g = gcd(param[0], param[1]);    //gcd(a, b) は以前作ったもの
	    for (int i = 1; i < len - 1; i++) {
	        g = gcd(g, param[i + 1]);       //gcd(a, b) は以前作ったもの
	    }
	    return g;
	}
	
	public static long lcm_n(long[] numbers) {
		long l;
		l = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			l = lcm(l, numbers[i]);
		}
		return l;
	}
	public static int H,W;
	public static char[][] c;
	public static boolean[][] b;
	
	
	public static void search(int x,int y) {
		if(x<0||x>W-1||y<0||y>H-1||(x<W&&y<H&&c[y][x]=='#')) {
			return;
		}
		
		if(b[y][x]) {
			return;
		}
		
		b[y][x] = true;
		
		search(x-1,y);
		search(x+1,y);
		search(x,y-1);
		search(x,y+1);
	}

	
    
	
	
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int result = 0;
	 Map<String,Integer> plus=new HashMap<String,Integer>();
	 Map<String,Integer> minus=new HashMap<String,Integer>();
	 int N=sc.nextInt();
	 for(int i=0;i<N;i++) {
		 String s=sc.next();
		 if(plus.containsKey(s)) {
			 plus.put(s,plus.get(s)+1);
		 }else {
			 plus.put(s,1);
		 }
	 }
	 
	 int M=sc.nextInt();
	 for(int i=0;i<M;i++) {
		 String s=sc.next();
		 if(minus.containsKey(s)) {
			 minus.put(s,minus.get(s)+1);
		 }else {
			 minus.put(s,1);
		 }
	 }
	 
	 List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(plus.entrySet());
     
     // 3.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
     Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
         public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
             // 4. 昇順
             return obj1.getValue().compareTo(obj2.getValue());
         }
     });
     
     for(Entry<String, Integer> entry : list_entries) {
    	 int temp = entry.getValue();
         if(minus.containsKey(entry.getKey())) {
        	 temp -= minus.get(entry.getKey());
         }
         
      
         
         if(temp>result) {
        	 result = temp;
         }
     }
     
     System.out.println(result);
	 
	
}
}
