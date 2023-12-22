import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Main {

    int[][] cells;
    int ans;
    boolean[][] already;
    
    public static void main(String[] args) throws IOException {
	Main m = new Main();
	m.solve();
    }

    private void solve() throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	cells = new int[n+1][n+1];
	for (int i=0;i<n;i++) {
	    cells[i][n] = cells[n][i] = -1;
	    String[] a = br.readLine().split("");
	    for (int j=0;j<n;j++) {
		if (a[j].equals("#")) {
		    cells[i][j] = -1;
		    continue;
		}
		cells[i][j] = Integer.parseInt(a[j]);
	    }
	}
	br.close();
	ans = 0;
	for (int i=0;i<n;i++) {
	    for (int j=0;j<n;j++) {
		if (cells[i][j] < 0) continue;
		//System.out.println("from "+i+" "+j);
		already = new boolean[n+1][n+1];
		search(i,j,cells[i][j]);
	    }
	}
	System.out.println(ans);
    }

    private void search(int i,int j,int c) {
	if (cells[i+1][j] > 0 && !already[i+1][j]) {
	    //System.out.println("at "+(i+1)+" "+j);
	    already[i+1][j] = true;
	    ans += c*cells[i+1][j];
	    search(i+1,j,c);
	}
	if (cells[i][j+1] > 0) {
	    //System.out.println("at "+i+" "+(j+1));
	    already[i][j+1] = true;
	    ans += c*cells[i][j+1];
	    search(i,j+1,c);
	}
    }
}