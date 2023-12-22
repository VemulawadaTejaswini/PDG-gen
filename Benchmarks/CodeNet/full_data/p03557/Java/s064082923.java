
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String strN = bufferedReader.readLine();
		String strA = bufferedReader.readLine();
		String strB = bufferedReader.readLine();
		String strC = bufferedReader.readLine();

		String[] listA = strA.split(" ");
		String[] listB = strB.split(" ");
		String[] listC = strC.split(" ");

		int n = Integer.parseInt(strN);
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(listA[i]);
			b[i] = Integer.parseInt(listB[i]);
			c[i] = Integer.parseInt(listC[i]);
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		int answer = 0;
		int startK = 0;
		int[] bc = new int[n];

		for(int j=0; j<n; j++) {
				for(int k=startK; k<n; k++) {
					if(b[j] < c[k]) {
						int i=0;
						while(i<=j) {
							bc[i] += n-k;
							i++;
						}
						startK = k;
						break;
					}
				}
		}


		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i] < b[j]) {
					answer += bc[j];
					break;
					}
				}
		}

		System.out.println(answer);

	}

}
