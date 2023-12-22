import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int W=in.nextInt();
		int H=in.nextInt();
		int N=in.nextInt();
		BitSet w=new BitSet(W);
		BitSet h=new BitSet(H);
		
		int res=0;
		for (int i = 0; i < N; i++) {
			int x=in.nextInt();
			int y=in.nextInt();
			int a=in.nextInt();
			if(a==1) {
				for (int j = 0; j <= x; j++) {
					w.set(j);
				}
			}
			if(a==2) {
				for (int j = x; j <= W; j++) {
					w.set(j);
				}
			}
			if(a==3) {
				for (int j = 0; j <= y; j++) {
					h.set(j);
				}
			}
			if(a==4) {
				for (int j = y; j <= H; j++) {
					h.set(j);
				}
			}
		}
		int countW=0;
		int countH=0;
		for (int i = 0; i <= W; i++) {
			if(!w.get(i)) {
				countW++;
			}
		}
		for (int i = 0; i <= H; i++) {
			if(!h.get(i)) {
				countH++;
			}
		}
		if(countW>0 && (w.get(0) && w.get(W)))
			countW++;
		if(countH>0 && (h.get(0) && h.get(H)))
			countH++;
		int area= countW*countH;
		System.out.println(area);
	}
}