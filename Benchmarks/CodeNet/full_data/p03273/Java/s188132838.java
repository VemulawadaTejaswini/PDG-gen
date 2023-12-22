import java.util.Scanner;
import java.lang.*;


class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H, W, flag = 1;
		H = sc.nextInt();
		W = sc.nextInt();
		String map[] = new String[H];
		for (int i = 0; i < H; i++) {
			map[i] = sc.next();

		}
		StringBuilder col = new StringBuilder();
		StringBuilder map2[] = new StringBuilder[H];
		for (int i = 0; i < H; i++) {
			map2[i] = new StringBuilder(map[i]);
		}

		while (flag == 1) {
			flag = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					//System.out.println("(" + i + "," + j + ")");
					if (map[i].charAt(j) == '#') {/*System.out.println("break!");*/ break;}
					if (j == W - 1 && map[i].contains(".")) {
						flag = 1;
						for (int k = 0; k < W; k++) {
							map2[i].setCharAt(k, 'o');
							map[i] = map2[i].toString();
						}
					}
				}
			}
			for (int i = 0; i < W; i++) {
				col = new StringBuilder();
				for (int j = 0; j < H; j++) {
					//System.out.println("(" + j + "," + i + ")");
					col.append(map[j].charAt(i));
					if (map[j].charAt(i) == '#') {/*System.out.println("break2!");*/ break;}
					if (j == H - 1 && col.toString().contains(".")) {
						flag = 1;
						//System.out.println("deleted!");
						for (int k = 0; k < H; k++) {
							map2[k].setCharAt(i, 'o');
							map[k] = map2[k].toString();
						}
					}

				}
			}
			/*for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print(map[i].charAt(j));
				
				}
				System.out.println();
			}*/
		}
		for (int i = 0; i < H; i++) {
			flag = 0;
			for (int j = 0; j < W; j++) {
				if (map[i].charAt(j) == 'o') continue;
				System.out.print(map[i].charAt(j));
				flag = 1;
			}
			if (flag == 1)System.out.println();
		}


	}
}