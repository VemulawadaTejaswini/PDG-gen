import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x1 = new int[n];
		int[] y1 = new int[n];
		int[] x2 = new int[n];
		int[] y2 = new int[n];
		int[] x3 = new int[n];
		int[] y3 = new int[n];
		int[] x4 = new int[n];
		int[] y4 = new int[n];
		int[] x5 = new int[n];
		int[] y5 = new int[n];
		int[] x6 = new int[n];
		int[] y6 = new int[n];
		long xs = 0;
		long ys = 0;
		for(int i = 0; i< n;i++){
			x1[i] = x2[i] = x3[i] = x4[i] = x5[i] = x6[i] = sc.nextInt();
			y1[i] = y2[i] = y3[i] = y4[i] = y5[i] = y6[i] = sc.nextInt();
			xs += x1[i];
			ys += y1[i];
		}
		long max = xs * xs + ys * ys;
		long m = 0;
		long a, b, c;
		for(int i = 0; i< n;i++){
			a = xs - x1[i];
			b = ys - y1[i];
			c = a * a + b * b;
			if(max < c){
				max = c;
				xs -= x1[i];
				ys -= y1[i];
				x1[i] = y1[i] = 0;
			}
		}

		xs = 0;
		ys = 0;
		for(int i = 0; i< n;i++){
			if(x2[i] + y2[i]  > 0){
				xs += x2[i];
				ys += y2[i];
				x2[i] = -x2[i];
				y2[i] = -y2[i];
			}
		}
		m = xs * xs + ys * ys;
		for(int i = 0; i< n;i++){
			a = xs + x2[i];
			b = ys + y2[i];
			c = a * a + b * b;
			if(m < c){
				m = c;
				xs += x2[i];
				ys += y2[i];
			}
		}

		if(m > max){
			max = m;
		}

		xs = 0;
		ys = 0;
		for(int i = 0; i< n;i++){
			if(x3[i] + y3[i]  < 0){
				xs += x3[i];
				ys += y3[i];
				x2[i] = -x3[i];
				y2[i] = -y3[i];
			}
		}
		m = xs * xs + ys * ys;
		for(int i = 0; i< n;i++){
			a = xs + x3[i];
			b = ys + y3[i];
			c = a * a + b * b;
			if(m < c){
				m = c;
				xs += x3[i];
				ys += y3[i];
			}
		}

		if(m > max){
			max = m;
		}

		if(m > max){
			max = m;
		}

		xs = 0;
		ys = 0;
		for(int i = 0; i< n;i++){
			if(x4[i] - y4[i]  > 0){
				xs += x4[i];
				ys += y4[i];
				x2[i] = -x4[i];
				y2[i] = -y4[i];
			}
		}
		m = xs * xs + ys * ys;
		for(int i = 0; i< n;i++){
			a = xs + x4[i];
			b = ys + y4[i];
			c = a * a + b * b;
			if(m < c){
				m = c;
				xs += x4[i];
				ys += y4[i];
			}
		}

		if(m > max){
			max = m;
		}

		xs = 0;
		ys = 0;
		for(int i = 0; i< n;i++){
			if(x4[i] - y4[i]  < 0){
				xs += x5[i];
				ys += y5[i];
				x2[i] = -x5[i];
				y2[i] = -y5[i];
			}
		}
		m = xs * xs + ys * ys;
		for(int i = 0; i< n;i++){
			a = xs + x5[i];
			b = ys + y5[i];
			c = a * a + b * b;
			if(m < c){
				m = c;
				xs += x5[i];
				ys += y5[i];
			}
		}

		if(m > max){
			max = m;
		}

		System.out.print(Math.sqrt(max));
	}

}