import java.io.*;
import java.util.*;
class Main{
	static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intMax 
    static final int INF = 1_000_000_000; // 10^9  
    public static void main(String[] args) throws Exception {
		hayami saori = new hayami();
		String s = saori.nextHayami();
		String[] s2 = s.split("");
		int q = saori.saori_hayami();
		String[][] sousa = new String[q][3];
		int t = 0;
		int f = 0;
		String str ="";
		String ans = s;
		String ans2 = s;
		int rev = 0;
		int[] flg = new int[q];
		for(int i = 0;i < q;i++){
			t = saori.saori_hayami();
			if(t == 1){
				sousa[i][0] = "hayami";
			} else {
				f = saori.saori_hayami();
				str = saori.nextHayami();
				sousa[i][f] = str;
				sousa[i][0] = "";
				flg[i] = f;
			}
			if(sousa[i][0].equals("hayami")){
				rev++;
			} else {
				if(flg[i] == 2){

					ans2 = sousa[i][2] + ans2;
					if(rev%2 == 0){
						ans = ans + sousa[i][2];
						ans2 = sousa[i][2] + ans2;
					} else {
						ans = sousa[i][2] + ans;
						ans2 = ans2 + sousa[i][2];
					}
				} else {
					ans2 = sousa[i][1] + ans;
					if(rev%2 == 0){
						ans = sousa[i][1] + ans;
						ans2 =ans2 + sousa[i][1];
					} else {
						ans =ans + sousa[i][1];
						ans2 = sousa[i][1] + ans2;
					}
				}
			}
		}
		if(rev%2 == 0){
			System.out.println(ans);
		} else {
			System.out.println(ans2);
		}
		saori.close();
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
