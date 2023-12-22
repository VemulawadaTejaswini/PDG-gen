

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long yen[] = new long[N];
		long honsu[] = new long[N];
		long total = 0;


		for (int i = 0; i < N; i++) {
			yen[i] = sc.nextInt();
			honsu[i] = sc.nextInt();
		}

		Data []d = new Data[N];
        for(int i= 0; i < N; i++) {
            d[i] = new Data(yen[i],honsu[i]);
        }


		Arrays.sort(d, new Comparator<Data>() {
            public int compare(Data d1, Data d2) {
                return d1.getA() - d2.getA();
            }
        });

		for (int i = 0; i < N; i++) {

			long a = d[i].getB();
			long b = d[i].getA();

			 if(M >= d[i].getB()) {
				 total += a * b;
				 M -= d[i].getB();
			 }else {
				 total += M * b;
				 break;
			 }

		}
		System.out.println(total);
	}

}

class Data{
    private long a;
    private long b;
    public Data(long a, long b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return (int) a;
    }
    public int getB() {
        return (int) b;
    }
}