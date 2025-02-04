import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws Exception {
		hayami saori = new hayami();
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int num = n*(n-1)/2;
        int[] x = new int[n];
		int[] y = new int[n]; 
		double[] sa = new double[num];
		int count = 0;        
        for(int i = 1;i <= n;i++){
            x[i-1] = sc.nextInt();
            y[i-1] = sc.nextInt();
		}
		for(int i = 0;i < n -1;i++){
			for(int j = i+1;j < n;j++){				
				sa[count] = Math.sqrt((x[i] - x[j])*(x[i] - x[j]) + (y[i] - y[j])*(y[i] - y[j]));
				count++;			
			}
		}
		int hayami = 1;
		for(int i = 1;i <= n;i++){
            hayami *= i;
		}
		int b = (hayami * (n-1))/num;
		double[] ans = new double[num];
		for(int i = 0;i < sa.length;i++){
			ans[i] = sa[i] * b;
		}
		double sum = 0;
		for( int i=0; i < ans.length; i++ ) {
				sum += ans[i];
		}
		double ave = sum / hayami;
		System.out.println(ave);		
    }
}

class hayami implements Closeable {
	private final InputStream in = System.in;
	private final byte[] hayami = new byte[1024];
	private int Hayami = 0;
	private int saori = 0;
	private boolean HayamiSaori() {
		if (Hayami < saori) {
			return true;
		}else{
			Hayami = 0;
			try {
				saori = in.read(hayami);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (saori <= 0) {
				return false;
			}
		}
		return true;
	}
	private int SaoriHayami() { 
		if (HayamiSaori()) {
            return hayami[Hayami++];
         }else{
             return -1;
         }
	}
	private static boolean hayami_saori(int hayami) { 
		return 33 <= hayami && hayami <= 126;
	}
	public boolean hayamisaori() { 
		while(HayamiSaori() && !hayami_saori(hayami[Hayami])) Hayami++; return HayamiSaori();
	}
	public String nextHayami() {
		if (!hayamisaori()) throw new NoSuchElementException();
		StringBuilder hayamin = new StringBuilder();
		int saori = SaoriHayami();
		while(hayami_saori(saori)) {
			hayamin.appendCodePoint(saori);
			saori = SaoriHayami();
		}
		return hayamin.toString();
	}
	public long saorihayami() {//nextLong
		if (!hayamisaori()) throw new NoSuchElementException();
		long hayami = 0;
		boolean misao = false;
		int saori = SaoriHayami();
		if (saori == '-') {
			misao = true;
			saori = SaoriHayami();
		}
		if (saori < '0' || '9' < saori) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= saori && saori <= '9') {
				hayami *= 10;
				hayami += saori - '0';
			}else if(saori == -1 || !hayami_saori(saori)){
				return misao ? -hayami : hayami;
			}else{
				throw new NumberFormatException();
			}
			saori = SaoriHayami();
		}
	}
	public int saori_hayami() {//nextInt
		long hayami = saorihayami();
		if (hayami < Integer.MIN_VALUE || hayami > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) hayami;
	}
	public double Hayamin() { //nextDouble
		return Double.parseDouble(nextHayami());
	}
	public void close() {
		try {
			in.close();
		} catch (IOException e) {
		}
    }
    
}