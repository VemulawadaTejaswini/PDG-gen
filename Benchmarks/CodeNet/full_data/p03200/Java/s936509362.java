import java.util.Scanner;

public class Main {
	static String[] SArray;
	static boolean flag = false;
	static int N;
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

        SArray = S.split("");
        N = SArray.length;

        f(N-2);

        System.out.println(cnt);
        
	}

	static int f(int n) {
		if(SArray[n].equals("B")&& SArray[n+1].equals("W")) {
            SArray[n]="W";
            SArray[n+1]="B";
            flag = true;
			cnt++;
        }

		if(n == 0) {
			if(flag && 1 < N) {
				flag = false;
				N -= 1;
				f(N-1);
			}else {
				return 0;
			}
		}else {
			return f(n-1);
		}
		return 0;

	}

}