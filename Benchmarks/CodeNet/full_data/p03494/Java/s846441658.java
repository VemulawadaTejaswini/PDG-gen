import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n;i++) a[i] = sc.nextInt();

		int count = 0;
		while(isAllEven(a)) {
		    count++;
		    for(int i = 0;i < n;i++) a[i] /= 2;
		}

		System.out.println(count);
    }

    private static boolean isAllEven(int[] a) {
        for(int i = 0;i < a.length;i++) {
            if(a[i] % 2 == 1) return false;
        }

        return true;
    }

}