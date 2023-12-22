import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] lists = new String[h][w];
		for(int i=0;i<h;i++) {
			String[] list = new String[w];
			String line = sc.next();
			for(int y=0;y<line.length();y++) {
				list[y] = String.valueOf(line.charAt(y));
			}
			lists[i] = list;
		}
		sc.close();
		boolean isNo = false;
		for(int i=0;i<h;i++) {
			for(int y=0;y<w;y++) {
				if(lists[i][y].equals("#")) {
					isNo = Main.isNo(lists, i, y);
				}
				if(isNo) break;
			}
			if(isNo) break;
		}
		System.out.println((isNo)?"No":"Yes");
	}

	private static boolean isNo(String[][] lists,int i,int y) {
		int targetW = y-1;
		int targetY = i-1;
		if(targetW>=0 ) {
			if(lists[i][targetW].equals("#")) {
				return false;
			}
		}
		targetW = y+1;
		if(targetW<lists[i].length) {
			if(lists[i][targetW].equals("#")) {
				return false;
			}
		}
		if(targetY>=0) {
			if(lists[targetY][y].equals("#")) {
				return false;
			}
		}
		targetY = i+1;
		if(targetY<lists.length) {
			if(lists[targetY][y].equals("#")) {
				return false;
			}
		}
		return true;
	}
}