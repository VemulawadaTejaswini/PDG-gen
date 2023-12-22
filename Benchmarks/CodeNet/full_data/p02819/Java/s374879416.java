import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

        int X = in.nextInt();
        List<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);

        int num = (X - 3) / 2;
        int[] primeList = new int[num];
        for (int i = 0; i < num; i++) {
            primeList[i] = 1;
        }
        for (int i = 0; i < num; i++) {
            if (primeList[i] == 1) {
                int primeNum = i + i + 3;
                // 遅くなるのでコメントアウト
                primeNumbers.add(primeNum);
                for (int j = i + primeNum; j < num; j += primeNum) {
                    primeList[j] = 0;
                }
            }
        }

        if(X == 2) {
        	System.out.println(2);
        	return;
        }

        if(X % 2 == 0) {
        	X++;
        }

        while(true) {
            boolean b = false;
        	for(int p: primeNumbers) {
        		if (X % p == 0) b = true;
        	}
        	if (b) {
        		X += 2;
        	} else {
        		break;
        	}
        }

        System.out.println(X);
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}