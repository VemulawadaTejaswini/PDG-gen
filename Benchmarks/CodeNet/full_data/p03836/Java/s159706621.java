import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		int sumx = tx-sx;
		int sumy = ty-sx;

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
		for(int i=0;i<sumy+1;i++) {
			res += "L";
		}
		res += "U";

		System.out.println(res);

	}

	public static long max(long[] array,int j) {
		long temp,max=-9999999;
		for(int i=j+1;i<array.length;i++) {
			temp = array[i] - array[j];
			if(temp > max) {
				max = temp;
			}
		}
		return max;
	}
}
