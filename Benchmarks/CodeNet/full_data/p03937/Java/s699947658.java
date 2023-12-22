import java.util.Scanner;

class Segment{
	int left, right;
	public Segment(int l, int r) {
		left = l; right = r;
	}
}
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt();
		Segment[] seg = new Segment[H];
		for(int i = 0; i < H; i++) {
			int l = 0, r = 0;
			String A = sc.next();
			l = A.indexOf('#');
			r = A.lastIndexOf('#');
			seg[i] = new Segment(l, r);
		}
		boolean check = true;
		for(int i = 1; i < H; i++) {
			if(seg[i - 1].right != seg[i].left) check = false;
		}
		System.out.println(check ? "Possible" : "Impossible");
	}
}