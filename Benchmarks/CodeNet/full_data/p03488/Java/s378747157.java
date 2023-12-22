
import java.util.*;
import java.util.Map.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s += 'T';
		int N=s.length();
		int x=sc.nextInt();
		int y=sc.nextInt();

		ArrayList<Integer>xl = new ArrayList<>();
		ArrayList<Integer>yl = new ArrayList<>();

		int sw = 0;
		int cnt = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c=='T') {
				if(sw%2==0) {
					xl.add(cnt);
				}else {
					yl.add(cnt);
				}
				sw = (sw+1)%2;
				cnt=0;

			}else {
				cnt++;
			}
		}


		boolean dpx[][] = new boolean[xl.size()+1][N*2+1];
		dpx[1][N+xl.get(0)]=true;
		for(int i=1; i<xl.size(); i++) {
			int f = xl.get(i);
			for(int j=0; j<=N*2; j++) {
				if(dpx[i][j]) {
					dpx[i+1][j+f] = true;
					dpx[i+1][j-f] = true;
				}
			}
		}
		boolean dpy[][] = new boolean[yl.size()+1][N*2+1];
		dpy[0][N]=true;
		for(int i=0; i<yl.size(); i++) {
			int f = yl.get(i);
			for(int j=0; j<=N*2; j++) {
				if(dpy[i][j]) {
					dpy[i+1][j+f] = true;
					dpy[i+1][j-f] = true;
				}
			}
		}
		if(dpx[xl.size()][N+x] && dpy[yl.size()][N+y]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
