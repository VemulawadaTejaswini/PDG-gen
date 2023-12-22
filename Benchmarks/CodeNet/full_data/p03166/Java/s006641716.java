import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) {
        hayami saori = new hayami();
        int v = saori.saori_hayami();
        int e = saori.saori_hayami();
        List<List<Integer>> adj = new ArrayList<List<Integer>>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
		}
		int[] dp = new int[v];

        for (int i = 0; i < e; i++) {
            int from = saori.saori_hayami()-1;
            int to = saori.saori_hayami()-1;
            adj.get(from).add(to);
        }
        int indegree[] = new int[v];

        for (int i = 0; i < v; i++) {
            List<Integer> temp = adj.get(i);
            for (int node : temp) {
                indegree[node]++;
            }
        }


        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        for (int i = 0; i < v; i++) {
            if (indegree[i] == 0) {
                q.addLast(i);
            }
        }

        int cnt = 0;

        List<Integer> res = new ArrayList<Integer>();

        while (!q.isEmpty()) {
            int u = q.removeFirst();
            res.add(u);

            for (int node : adj.get(u)) {

                indegree[node]--;
                if (indegree[node] == 0) {
					q.addFirst(node);
					dp[node] = Math.max(dp[node], dp[u]+1);
                }
            }
            cnt++;
            if (cnt > v) {
                System.out.println("zyunkanari");
                return;
            }
        }
		int ans = 0;
		for(int i = 0;i < dp.length;i++){
			ans = Math.max(dp[i], ans);
		}
		System.out.println(ans);
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