import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String st[] = new String[h];
		boolean tw[] = new boolean[w];
		boolean th[] = new boolean[h];
		for (int i=0;i<h;i++)
			th[i] = false;
		for (int j=0;j<w;j++)
			tw[j] = false;
		
		for (int i=0;i<h;i++) {
			st[i] = sc.next();
			for (int j=0;j<w;j++) {
				tw[j] |= st[i].charAt(j)!='.';
				th[i] |= st[i].charAt(j)!='.';
			}
		}
		
		for (int i=0;i<h;i++) {
			if (th[i]) {
				for (int j=0;j<w;j++) {
					if (tw[j]) System.out.print(st[i].charAt(j));
				}
			System.out.println();
			}
		}

	}

}
