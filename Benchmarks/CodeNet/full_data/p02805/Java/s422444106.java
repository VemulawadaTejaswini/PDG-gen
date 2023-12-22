import java.util.*;
import java.io.*;
import java.math.*;

	
public class Main {
    
    static class Line {
        boolean parYaxis=false;
        double sl=0.0, ic=0.0;
        public Line(double slope, double intercept){
            this.sl=slope;
            this.ic=intercept;
        }
        public Line(boolean slope, double intercept){
            if(slope==false) throw new IllegalArgumentException();
            this.parYaxis=slope;
            this.ic=intercept;
        }
        public static Dector isect(Line l, Line m){
            if(l.parYaxis){
                if(m.parYaxis){
                    throw new IllegalArgumentException("Parallel Line Never Crosses!");
                }else{
                    return new Dector(l.ic, m.fx(l.ic));
                }
            }else if(m.parYaxis){
                return new Dector(m.ic, l.fx(m.ic));
            }
            if(l.sl == m.sl) throw new IllegalArgumentException("Parallel Line Never Crosses!");
            double x1 = m.ic-l.ic;
            x1 /= (l.sl-m.sl);
            return new Dector(x1, l.fx(x1));
        }
        public double fx(double x1){
            return x1*sl + ic;
        }
        public void show2(){
            System.out.println("y="+sl+"x+"+ic);
        }
    }
    
    static class Dector {
        double x,y;
        public Dector(double sx, double sy){
            this.x=sx;
            this.y=sy;
        }
        public static double dist(Dector a, Dector b){
            return hypod(a.x-b.x, a.y-b.y);
        }
        public static Dector medi(Dector a, Dector b){
            return new Dector((a.x+b.x)/2.0, (a.y+b.y)/2.0);
        }
        public static Line bisect(Dector p, Dector q){
            if(q.y==p.y) return new Line(true, (p.x+q.x)/2.0);
            
            double slope = p.x-q.x;
            slope /= (q.y-p.y);
            Dector m = medi(p,q);
            double intercept = m.y - slope*m.x;
            return new Line(slope, intercept);
        }
        public static boolean canTringle(Dector a, Dector b, Dector c){
            
            if(a.equals(b)) return false;
            if(b.equals(c)) return false;
            if(c.equals(a)) return false;
            if(((a.x-b.x)*(b.y-c.y)) == ((a.y-b.y)*(b.x-c.x))) return false;
            return true;
        }
        public static Dector circumcentre(Dector a, Dector b, Dector c){
            return Line.isect(Dector.bisect(a,b), Dector.bisect(b,c));
        }
        public void show2(){
            System.out.println(x+","+y);
        }
        public boolean equals(Dector cf){
            if(x != cf.x) return false;
            if(y != cf.y) return false;
            return true;
        }
    }
    
	public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int n = sc.nexI();
		
		Dector[] dt = new Dector[n];
		

		for(int i=0; i<n; i++){
		    double x1 = sc.nexD();
		    double y1 = sc.nexD();
		    dt[i] = new Dector(x1, y1);
		}
		
		double ans = 10000.0;
		
		
		for(int i=0; i<(n-1); i++){
		    for(int j=i+1; j<n; j++){
		        Dector m = Dector.medi(dt[i],dt[j]);
		        double r = Dector.dist(dt[i],dt[j])/2.0;
		        if(enclose_all(dt, m, r)) ans = min(ans, r);
		    }
		}
		
		for(int i=0; i<(n-2); i++){
		    for(int j=i+1; j<(n-1); j++){
		        for(int k=j+1; k<n; k++){
		            if(Dector.canTringle(dt[i],dt[j],dt[k])){
    		            Dector m = Dector.circumcentre(dt[i],dt[j],dt[k]);
    		            double r = Dector.dist(dt[i], m);
    		            if(enclose_all(dt, m, r)) ans = min(ans, r);
		            }
		        }
		    }
		}
		out.println(ans);
	    out.flush();
	}
	
	private static boolean enclose_all(Dector[] dt, Dector o, double r){
	    for(int i=0; i<dt.length; i++){
	        double d = Dector.dist(dt[i], o);
	        if(d>r) return false;
	    }
	    return true;
	}

	private static double min(double a, double b){    return (a>b) ? b : a;   }

	private static double hypod(double a, double b){
	    return Math.sqrt(a*a+b*b);
	}

    static class FastScanner {
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
    	public long nexL() {
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
    			}else if(b == -1 || !isPrintableChar(b) || b == ':'){
    				return minus ? -n : n;
    			}else{
    				throw new NumberFormatException();
    			}
    			b = readByte();
    		}
    	}
    	public int nexI() {
    		long nl = nexL();
    		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
    		return (int) nl;
    	}
    	public double nexD() { return Double.parseDouble(next());}
    	
    	public void al(long[] array){
    	   	for(int i=0; i<array.length; i++){
    	   	    array[i] = nexL();
    	   	}
    	   	return;
    	}
    	public void ai(int[] array){
    	   	for(int i=0; i<array.length; i++){
    	   	    array[i] = nexI();
    	   	}
    	   	return;
    	}
    	public void ai2(int[] as, int[] bs){
    	   	for(int i=0; i<as.length; i++){
    	   	    as[i] = nexI();
    	   	    bs[i] = nexI();
    	   	}
    	   	return;
    	}
    	public void al2(long[] as, long[] bs){
    	   	for(int i=0; i<as.length; i++){
    	   	    as[i] = nexL();
    	   	    bs[i] = nexL();
    	   	}
    	   	return;
    	}
    	public void ai3(int[] as, int[] bs, int[] cs){
    	   	for(int i=0; i<as.length; i++){
    	   	    as[i] = nexI();
    	   	    bs[i] = nexI();
    	   	    cs[i] = nexI();
    	   	}
    	   	return;
    	}
    	public void ad2i(int[][] as){
    	    for(int i=0; i<as.length; i++){
    	        for(int j=0; j<as[0].length; j++){
    	            as[i][j] = nexI();
    	        }
    	    }
    	    return;
    	}
    }
}