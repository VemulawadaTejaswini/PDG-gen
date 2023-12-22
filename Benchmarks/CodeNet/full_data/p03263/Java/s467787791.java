
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		List<Pos> odd = new ArrayList<>();
		for(int i = 1; i < h + 1; i++) {
			for(int j = 1; j < w + 1; j++) {
				int tmp = sc.nextInt();
				if(tmp % 2 != 0) {
					odd.add(new Pos(i, j));
				}
			}
		}
		long count = 0;
		String ans = "";
		for(int i = 0; i < odd.size(); i = i + 2) {
			if(i + 1 < odd.size()) {
				int befh = odd.get(i).getHigh();
				int befw = odd.get(i).getWide();
				int afh = odd.get(i + 1).getHigh();
				int afw = odd.get(i + 1).getWide();
				if(befh < afh) {
					for(int j = befh + 1; j < afh + 1; j++) {
						int k = j - 1;
						ans += k + " " + befw + " " + j + " " + befw + "\n";
						count++;
					}
				} else if(befh > afh) {
					for(int j = befh - 1; j > afh - 1; j--) {
						int k = j + 1;
						ans += k + " " + befw + " " + j + " " + befw + "\n";
						count++;
					}
				}
				if(befw < afw) {
					for(int j = befw + 1; j < afw + 1; j++) {
						int k = j - 1;
						ans += afh + " " + k + " " + afh + " " + j + "\n";
						count++;
					}
				} else if(befw > afw) {
					for(int j = befw - 1; j > afw - 1; j--) {
						int k = j + 1;
						ans += afh + " " + k + " " + afh + " " + j + "\n";
						count++;
					}
				}
			}
		}
		System.out.println(count + "\n" + ans);
	}

}

class Pos {
	private int high;
	private int wide;

	protected Pos(int high, int wide) {
		super();
		this.high = high;
		this.wide = wide;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getWide() {
		return wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}

}