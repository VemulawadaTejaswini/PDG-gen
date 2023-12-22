import java.util.*;
public class Main{
	
	public static class Trio{
		int x, y, dir, instr;
		public Trio(int x, int y, int dir, int instr) {
			this.x = x; this.y = y; this.dir = dir; this.instr = instr;
		}
	}
	
	static String s;
	static int X, Y;
	static int dir;

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		s = sc.next();
		X = sc.nextInt(); Y = sc.nextInt();
		
		if(rec(0, 0, 1, 0)) System.out.println("Yes");
		else System.out.println("No");
		//dir 1 pos x dir 2 neg x dir 3 pos y dir 4 neg y
//		
//		boolean grid [][][][] =new boolean[16000][16000][5][8001];
//		
//		int cordX = 0, cordY = 0;
//				
//		for(int i = 0; i<s.length(); i++) {
//			if(s.charAt(i) == 'F') {
//				if(dir == 1) cordX++;
//				if(dir == 2) cordX--;
//				if(dir == 3) cordY++;
//				if(dir == 4) cordY--;
//			}
//			
//			else if(s.charAt(i) == 'T'){
//				if(dir == 1 || dir == 2) {
//					if(y > cordY) dir = 3;
//					else dir = 4;
//				}
//				else if(dir == 3 || dir == 4){
//					if(x > cordX) dir = 1;
//					else dir = 2;
//				}
//			}
//		}
//		
//		if(cordX == x && cordY == y) System.out.println("Yes");
//		else System.out.println("No");
//		
//		System.out.println(cordX + " " + cordY);
	}
//FTFFTFTFTFF
//	1 2
	
	public static boolean rec(int x, int y, int dir, int instr) {
		
		if(instr == s.length()) {
			if(x == X && y == Y) return true;
			else return false;
		}
		
		if(s.charAt(instr) == 'T') {
			if(dir == 1 || dir == 2) {
				return rec(x, y, 3, instr+1) | rec(x, y, 4, instr+1);
			}
			else {
				return rec(x, y, 1, instr+1) | rec(x, y, 2, instr+1);
			}
		}
		else {
			if(dir == 1) return rec(x+1, y, 1, instr+1);
			if(dir == 2) return rec(x-1, y, 2, instr+1);
			if(dir == 3) return rec(x, y+1, 3, instr+1);
			if(dir == 4) return rec(x, y-1, 4, instr+1);

		}
		
		return false;
		
	}
}
