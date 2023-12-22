import java.util.Scanner;

class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int H = Integer.parseInt(N.substring(0,1));
		int W = Integer.parseInt(N.substring(2,3));
		char[][] hw = new char[H][W];
		
		for(int i = 0; i < H; i++) {
			String s = sc.nextLine();
			for(int j = 0; j < W; j++) {
				hw[i][j] = s.charAt(j);
			}
		}
		sc.close();
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(hw[i][j] == '#') {
					System.out.print("#");
				}else {
					System.out.print(mine(i, j, hw));
				}
			}
			System.out.println();
		}
	}
	
	public static int mine(int h, int w, char[][]hw) {
		int count = 0;
		for(int i = h - 1; i <= h + 1; i++) {
			if(i < 0 || i >= hw.length) {
				continue;
			}else {
				for(int j = w - 1; j <= w + 1; j++) {
					if(j < 0 || j >= hw[0].length) {
						continue;
					}else {
						if(hw[i][j] == '#') {
							count++;
						}
					}
				}
			}
		}
		return count;
	}
}