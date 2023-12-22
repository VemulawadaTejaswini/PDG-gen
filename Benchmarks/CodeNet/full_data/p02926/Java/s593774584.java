import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); vec[] a = new vec[n];
		double max = 0; double sumx = 0; double sumy = 0;  int count = 0;
		boolean flag = false;
		for(int i = 0; i < n; i++) {
			a[i] = new vec(sc.nextDouble(),sc.nextDouble());
		}

		/*for(vec v: a)
			System.out.println(v.arg);*/

		Arrays.sort(a, new Comparator<vec>(){
			public int compare(vec a, vec b){
				if(a.arg > b.arg) return 1;
				else if(a.arg == b.arg) return 0;
				else return -1;
			}
		});

		/*for(vec v: a)
		System.out.println(v.arg);*/

		for(int i = 0; i < n; i++) {

			count = i;

			while(true) {

				if((!flag && a[count].arg - a[i].arg <= 90) || (flag && a[count].arg + 360 -a[i].arg <= 90)) {
					sumx += a[count].x;
					sumy += a[count].y;
				}else if((!flag && a[count].arg - a[i].arg > 90) ||( flag && a[count].arg +360 - a[i].arg > 90)) {
					double b = sumx*sumx + sumy*sumy;
					//System.out.println(b);
					max = Math.max(max, b);
					flag = false;
					sumx = 0;
					sumy = 0;
					break;
				}

				if(count == n-1) {
					count = 0;
					flag = true;
				}else {
					count++;
				}
			}
		}

		System.out.println(String.format("%.11f",Math.sqrt(max)));
		sc.close();
	}

	public static class vec{
		double x; double y; double arg;

		vec(double x, double y){
			this.x = x; this.y = y;
			double s = 0;
			if(!(x == 0 && y == 0)) {
				s = Math.acos(x/Math.sqrt(x*x+y*y));
			}
			s = (s/Math.PI)*180;
			if(y<0) s = 360 -s;
			this.arg = s;
		}
	}

}