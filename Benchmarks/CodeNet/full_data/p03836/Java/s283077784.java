import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = Integer.parseInt(sc.next());
		int sy = Integer.parseInt(sc.next());
		int tx = Integer.parseInt(sc.next());
		int ty = Integer.parseInt(sc.next());

		int sumx = tx-sx;
		int sumy = ty-sy;

		String res="";

		for(int i=0;i<sumy;i++) {
			res += "U";
		}
		for(int i=0;i<sumx;i++) {
			res += "R";
		}
		for(int i=0;i<sumy;i++) {
			res += "D";
		}
		for(int i=0;i<sumx+1;i++) {
			res += "L";
		}
		for(int i=0;i<sumy+1;i++) {
			res += "U";
		}
		for(int i=0;i<sumx+1;i++) {
			res += "R";
		}
		res += "DR";
		for(int i=0;i<sumy+1;i++) {
			res += "D";
		}
		for(int i=0;i<sumx+1;i++) {
			res += "L";
		}
		res += "U";

		System.out.println(res);

	}

}
