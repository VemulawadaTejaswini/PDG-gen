import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static class Cake {
		public BigDecimal x;
		public BigDecimal y;
		public BigDecimal z;

		public Cake(BigDecimal x, BigDecimal y, BigDecimal z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public BigDecimal getNextScore(BigDecimal cx, BigDecimal cy, BigDecimal cz) {
			BigDecimal nx = cx.add(x);
			BigDecimal ny = cy.add(y);
			BigDecimal nz = cz.add(z);
			BigDecimal result = new BigDecimal(0);
			result = result.add(nx.abs());
			result = result.add(ny.abs());
			result = result.add(nz.abs());
			return result;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int m = Integer.parseInt(tokens[1]);
		List<Cake> cakes = new ArrayList<>(n);
		for (int i = 0; i < n; ++i) {
			tokens = in.nextLine().split(" ");
			BigDecimal x = new BigDecimal(tokens[0]);
			BigDecimal y = new BigDecimal(tokens[1]);
			BigDecimal z = new BigDecimal(tokens[2]);
			cakes.add(new Cake(x, y, z));
		}

		BigDecimal score = new BigDecimal(0);
		BigDecimal cx = new BigDecimal(0);
		BigDecimal cy = new BigDecimal(0);
		BigDecimal cz = new BigDecimal(0);
		for (int i = 0; i < m; ++i) {
			BigDecimal nScore = new BigDecimal(Long.MIN_VALUE);
			int selectIndex = -1;
			for (int j = 0; j < cakes.size(); ++j) {
				if (cakes.get(j).getNextScore(cx, cy, cz).compareTo(nScore) > 0) {
					selectIndex = j;
					nScore = cakes.get(j).getNextScore(cx, cy, cz);
				}
			}
			Cake selectCake = cakes.get(selectIndex);
			score = nScore;
			cx = cx.add(selectCake.x);
			cy = cy.add(selectCake.y);
			cz = cz.add(selectCake.z);
			cakes.remove(selectIndex);
		}
		System.out.println(score);

		in.close();
	}

}