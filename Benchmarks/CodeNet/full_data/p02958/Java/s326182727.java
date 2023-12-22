public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int[] p = new int[s.nextInt()];
		for(int i=0;i<p.length;i++) {
			p[i]=s.nextInt();
		}
		System.out.println(calc(p)?"YES":"NO");
	}
	public static boolean calc(int[] p) {
		int count = 0;
		for(int i=0;i<p.length;i++) {
			if(p[i] != i+1) {
				count++;
			}
		}
		if(count==0 || count==2) {
			return true;
		}else {
			return false;
		}
	}
}
