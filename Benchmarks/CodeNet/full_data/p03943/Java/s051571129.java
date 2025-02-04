import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		int wi = Integer.parseInt(line[0]);
		int hi = Integer.parseInt(line[1]);
		int n = Integer.parseInt(line[2]);
		int xrg[] = {0, wi};
		int yrg[] = {0, hi};
		int dir;
		while (n > 0) {
			line = br.readLine().split(" ");
			dir = Integer.parseInt(line[2]);
			if (dir == 1) {
				xrg[0] = Math.max(xrg[0], Integer.parseInt(line[0]));
			} else if (dir == 2) {
				xrg[1] = Math.min(xrg[1], Integer.parseInt(line[0]));
			} else if (dir == 3) {
				yrg[0] = Math.max(yrg[0], Integer.parseInt(line[1]));
			} else if (dir == 4) {
				yrg[1] = Math.min(yrg[1], Integer.parseInt(line[1]));
			}
			n--;
		}
		System.out.println(Math.max((xrg[1] - xrg[0]), 0)*Math.max((yrg[1] - yrg[0]), 0));
	}
}