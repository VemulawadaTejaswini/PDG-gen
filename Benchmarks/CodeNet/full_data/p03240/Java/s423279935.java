import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		boolean[][] po = new boolean[101][101];
		for (int x=0; x<=100; x++) {
			for(int y=0; y<=100; y++) po[x][y] = true;
		}

		ArrayList<int[]> info = new ArrayList<>();
		ArrayList<int[]> zrInfo = new ArrayList<>();
		boolean got = false;
		for (int i=0; i<n; i++){
			int nux = scanner.nextInt();
			int nuy = scanner.nextInt();
			int nuh = scanner.nextInt();
			if (nuh==0) {
				po[nux][nuy] = false;
				int[] nu = {nux, nuy, nuh};
				zrInfo.add(nu);
				continue;
			}
			if (!got){
				for (int[] old: info) {
					int cnt=0;
					for(int x=0; x<=100; x++){
						for (int y=0; y<=100; y++){
							if(!po[x][y]) continue;
							if(nuh+Math.abs(x-nux)+Math.abs(y-nuy)!=old[2]+Math.abs(x-old[0])+Math.abs(y-old[1])){
								po[x][y] = false;
							}else cnt++;
						}
					}
					if (cnt==1){
						got = true;
						break;
					}
				}
				int[] nu = {nux, nuy, nuh};
				info.add(nu);
			}
		}

		for (int x=0; x<=100; x++){
			for (int y=0; y<=100; y++) {
				if (po[x][y]){
					int[] dat = info.get(0);
					int H = dat[2]+Math.abs(x-dat[0])+Math.abs(y-dat[1]);
					{
						int X = x;
						int Y = y;
						boolean[] conf = {true};
						zrInfo.forEach(pnt -> conf[0] = (conf[0] && H-Math.abs(pnt[0]-X)-Math.abs(pnt[1]-Y)<=0));
						if(!conf[0]) continue;
					}
					System.out.println(x+" "+y+" "+H);
					System.exit(0);
				}
			}
		}
	}

}