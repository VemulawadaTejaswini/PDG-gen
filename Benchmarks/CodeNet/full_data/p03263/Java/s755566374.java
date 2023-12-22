import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int H = sc.nextInt();
		final int W = sc.nextInt();
		int a[][] = new int[H][W];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		ArrayList<Integer> ans_y1 = new ArrayList<Integer>();
		ArrayList<Integer> ans_x1 = new ArrayList<Integer>();
		ArrayList<Integer> ans_y2 = new ArrayList<Integer>();
		ArrayList<Integer> ans_x2 = new ArrayList<Integer>();
		for(int h = 0; h < H; h++) {
			if(h % 2 == 0) {
				for(int w = 0; w < W; w++) {
					if(a[h][w] % 2 == 1) {
						a[h][w]--;
						ans_y1.add(h);
						ans_x1.add(w);
						if(w == W - 1) {
							if(h != H - 1) {
								a[h + 1][w]++;
								ans_y2.add(h + 1);
								ans_x2.add(w);
							} else {
								ans_y1.remove(ans_y1.size() - 1);
								ans_x1.remove(ans_x1.size() - 1);
							}
						} else {
							a[h][w + 1]++;
							ans_y2.add(h);
							ans_x2.add(w + 1);
						}

					}
				}
			} else {
				for(int w = W - 1; w >= 0; w--) {
					if(a[h][w] % 2 == 1) {
						a[h][w]--;
						ans_y1.add(h);
						ans_x1.add(w);
						if(w == 0) {
							if(h != H - 1) {
								a[h + 1][w]++;
								ans_y2.add(h + 1);
								ans_x2.add(w);
							} else {
								ans_y1.remove(ans_y1.size() - 1);
								ans_x1.remove(ans_x1.size() - 1);
							}
						} else {
							a[h][w - 1]++;
							ans_y2.add(h);
							ans_x2.add(w - 1);
						}
					}
				}
			}
		}
		System.out.println(ans_y1.size());
		for(int i = 0; i < ans_y1.size(); i++) {
			System.out.print(ans_y1.get(i) + 1 + " ");
			System.out.print(ans_x1.get(i) + 1 + " ");
			System.out.print(ans_y2.get(i) + 1 + " ");
			System.out.println(ans_x2.get(i) + 1);
		}
	}
}
