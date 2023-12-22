import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		boolean wcan = true;
		boolean acan = true;
		int wa = 0,ac = 0;
		int x = 0;
		while(m-->0) {
			int a=sc.nextInt();
			String s=sc.nextLine();
			if(!wcan&&!acan&&a!=x) {
				wcan = true;
				acan = true;
			}
			x = a;
			if(wcan) {
				if(s.equals(" WA")) {
					wa++;
					wcan = false;
				}
			}
			if(acan) {
				if(s.equals(" AC")) {
					ac++;
					acan = false;
				}
			}
		}
		System.out.print(ac+" "+wa);
	}
}
