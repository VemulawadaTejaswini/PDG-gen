import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		Garden garden = new Garden(n,h);
		while(garden.gardenFlag()) {
			garden.watering();
		}

		System.out.println(garden.getWaterCount());
		sc.close();
	}
}
class Garden{

	int n;
	int[] f;
	int[] h;
	int waterCount;

	Garden(int n, int[] h){
		this.n = n;
		this.h = h;
		f = new int[n];
		waterCount = 0;
	}
	//waterCount取得
	int getWaterCount() {
		return waterCount;
	}

	//判別
	boolean gardenFlag() {
		boolean flag = false;
		for(int i = 0; i < n; i++) {
			if(f[i] != h[i]) {
				flag = true;//異なっていたら続行
				break;
			}
		}
		return flag;
	}

	//開始地点
	int startPoint() {
		int sp = 0;
		for(int i = 0; i < n; i++) {
			if(f[i] < h[i]) {
				sp = i;
				break;
			}
		}
		return sp;
	}
	//終了地点
	int[] endPoint() {
		int[] point = new int[2];
		point[0] = startPoint();
		point[1] = point[0] + 1;

		for(int i = point[0] + 1; i < n; i++) {
			if(f[i] < h[i]) {
				point[1]++;
			}
			if(f[i] == h[i]) {
				break;
			}
		}
		return point;
	}
	//水やり
	void watering() {
		int[] point = endPoint();
		for(int i = point[0]; i < point[1]; i++) {
			f[i]++;
		}
		waterCount++;
		System.out.println();
	}
}
