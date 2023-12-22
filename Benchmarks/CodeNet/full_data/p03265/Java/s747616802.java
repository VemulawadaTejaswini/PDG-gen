import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int wid = Math.abs(Math.min(x1, x2) - Math.max(x1, x2));
		int heg = Math.abs(Math.min(y1, y2) - Math.max(y1, y2));

		if(x1 <= x2){
		System.out.print(x2 - heg + " ");
		System.out.print(y2 + wid + " ");
		System.out.print(x1 - heg + " ");
		System.out.println(y1 + wid);
		} else {
			System.out.print(x2 - heg + " ");
			System.out.print(y2 - wid + " ");
			System.out.print(x1 - heg + " ");
			System.out.println(y1 - wid);
		}


	}
}