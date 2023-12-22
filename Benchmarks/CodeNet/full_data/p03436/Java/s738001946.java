import java.io.*;
import java.util.*;
class Main{
	static int H;
	static int W;
    public static void main(String[] args) throws Exception {
		hayami saori = new hayami();
		H = saori.saori_hayami();
		W = saori.saori_hayami();
		char[][] s = new char[H][W];
		int[][] moves = new int[H][W];

		int dx[] = { 0, 1, 0, -1 };
        int dy[] = { -1, 0, 1, 0 };

		Queue<Pair> que = new ArrayDeque<>();
		
		int count = 0;
		for(int i = 0;i < H;i++){
			String str = saori.nextHayami();
			for(int j = 0;j < W;j++){
				s[i][j] = str.charAt(j);
				if(s[i][j] == '#')count++;
			}
		}

		Pair st = new Pair(0, 0);
		que.add(st);
		while(!que.isEmpty()){
			Pair p = que.poll();
			if(p.x==H-1&&p.y==W-1)break;
			s[p.x][p.y] = '#';
			for(int i=0;i<4;i++){
			  int cx = p.x+dx[i];
			  int cy = p.y+dy[i];
			  if(cx >= 0 && cx <= H-1 && cy >= 0 && cy <= W-1 && s[cx][cy] == '.' ){
				moves[cx][cy] = moves[p.x][p.y] + 1;
				que.add(new Pair(cx,cy));
			  }
			}
		}
		if(moves[H - 1][W - 1] != 0){
			System.out.println(H*W - count - moves[H - 1][W - 1] - 1);
		} else{
			System.out.println(-1);
		}
		

    }
}

class Pair{
	int x;
	int y;

	public Pair(int x,int y){
		this.x = x;
		this.y = y;
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