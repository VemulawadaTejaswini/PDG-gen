public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int h[] = new int[s.nextInt()];
		for(int i=0;i<h.length;i++) {
			h[i]=s.nextInt();
		}
		System.out.println((calc(h)?"Yes":"No"));

	}
	public static boolean calc(int h[] ) {
		h[0]--;
		for(int i=1;i<h.length;i++) {
			if(h[i-1]<h[i]) {
				h[i]--;
			}
			else if(h[i-1]>h[i]) {
				return false;
			}
		}
		return true;
	}
}
