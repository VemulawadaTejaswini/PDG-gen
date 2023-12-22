import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int N = s.length;
		int x = sc.nextInt();
		int y = sc.nextInt();
		List<Integer> ls = new ArrayList<>();
		int c = 0;
		for(int i = 0; i < N; i++) {
			if(s[i] == 'F')
				c++;
			else {
				ls.add(c);
				c = 0;
			}
		}
		ls.add(c);
		x -= ls.get(0);
		boolean[][] dpx = new boolean[2][16001];
		boolean[][] dpy = new boolean[2][16001];
		dpx[0][8000] = dpy[0][8000] = true;
		for(int i = 1; i < ls.size(); i++) {
			if(i % 2 == 0){
				dpx[1] = new boolean[16001];
				for(int j = 0; j <= 16000; j++)
					if(dpx[0][j] == true) {
						dpx[1][j+ls.get(i)] = true;
						dpx[1][j-ls.get(i)] = true;
					}
				dpx[0] = dpx[1].clone();
			}
			else {
				dpy[1] = new boolean[16001];
				for(int j = 0; j <= 16000; j++)
					if(dpy[0][j] == true) {
						dpy[1][j+ls.get(i)] = true;
						dpy[1][j-ls.get(i)] = true;
					}
				dpy[0] = dpy[1].clone();
			}
		}
		if(ls.size() <= 2)
			dpx[1][8000] = dpy[1][8000] = true;
		if(dpx[1][8000+x] && dpy[1][8000+y])
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}