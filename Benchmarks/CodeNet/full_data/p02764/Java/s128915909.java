import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	double dist(double xi,double yi,double xj,double yj) {
		double dx=xi-xj;
		double dy=yi-yj;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	double[][] cross(double xi,double yi,double ri,double xj,double yj,double rj){
		if(ri+rj<dist(xi,yi,xj,yj))return null;
		if(Math.max(ri, rj)>dist(xi,yi,xj,yj)+Math.min(ri, rj))return null;
		double rr=ri*ri;
		double RR=rj*rj;
		double dx=xj-xi;
		double dy=yj-yi;
		double pp=dx*dx+dy*dy;
		double dr=rr-RR+pp;
		double D=dr*dr-4*pp*rr;
		double re=dr,im=0;
		if(D>=0)re+=Math.sqrt(D);
		else im+=Math.sqrt(-D);
		double[] X= {(re*dx-im*dy)/(2*pp)+xi,(re*dx+im*dy)/(2*pp)+xi};
		double[] Y= {(re*dy+im*dx)/(2*pp)+yi,(re*dy-im*dx)/(2*pp)+yi};
		double[][] ret=new double[2][];
		ret[0]=X;
		ret[1]=Y;
		return ret;
	}
	
	boolean f(double[] x,double[] y,int[] c,double time,int K) {
		ArrayList<double[]> list=new ArrayList<>();
		for(int i=0;i<x.length;++i) {
			list.add(new double[] {x[i],y[i]});
			for(int j=0;j<y.length;++j) {
				if(i==j)continue;
				double ri=(time/c[i]);
				double rj=(time/c[j]);
				double[][] cross=cross(x[i],y[i],ri,x[j],y[j],rj);
				if(cross==null)continue;
				for(int t=0;t<2;++t)list.add(new double[] {cross[0][t],cross[1][t]});
			}
		}
		for(double[] p:list) {
			int cnt=0;
			for(int k=0;k<x.length;++k) {
				double dx=p[0]-x[k];
				double dy=p[1]-y[k];
				double r=time/c[k];
				if(r*r+1e-6>=dx*dx+dy*dy)++cnt;
			}
			if(cnt>=K)return true;

		}
		return false;
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		PrintWriter pw=new PrintWriter(System.out);
		int N=sc.nextInt();
		int K=sc.nextInt();
		double[] x=new double[N];
		double[] y=new double[N];
		int[] c=new int[N];
		for(int i=0;i<N;++i) {
			x[i]=sc.nextDouble();
			y[i]=sc.nextDouble();
			c[i]=sc.nextInt();
		}
		double ok=100*2000;
		double ng=0;
		for(int t=0;t<100;++t) {
			double middle=(ok+ng)/2;
			if(f(x,y,c,middle,K)) {
				ok=middle;
			}else {
				ng=middle;
			}
		}
		pw.println(ok);
		pw.close();
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
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