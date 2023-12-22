import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[] a=new Integer[n];
        Integer[] b=new Integer[n];
        Integer[] c=new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            c[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

		int count = 0;
		int aCount = 0;
		int cCount = 0;
		for (int i = 0; i < n; i++) {
			int tar = b[i];
			for (int j = 0; j < n; j++) {
				if (tar > a[j]) {
					aCount++;
				} else {
					break;
				}
			}
			for (int j = n - 1; j >= 0; j--) {
				if (tar < c[j]) {
					cCount++;
				} else {
					break;
				}
			}
			count += aCount * cCount;
			aCount = 0;
			cCount = 0;
		}

		System.out.println(count);
	}
}
