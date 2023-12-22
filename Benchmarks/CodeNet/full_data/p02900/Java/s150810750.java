import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		ArrayList<Integer> sosu = new ArrayList<Integer>();
		sosu.add(1);

		for (int i = 2;i <= Math.min(a, b);) {
            if (a % i == 0&&b%i==0) { // 最小の因数を求める

                if(i!=sosu.get(sosu.size()-1)){
                sosu.add(i);}
                a /= i;
                b /= i;// 最小の因数で割った数を代入する
            } else
                i++;
        }
System.out.println(sosu.size());

	}

}
