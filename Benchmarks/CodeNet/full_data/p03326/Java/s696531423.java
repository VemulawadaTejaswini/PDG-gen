import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Sweet[] Sweets = new Sweet[n];

		for (int i=0;i<n;i++) {
			Sweets[i] = new Sweet();
			Sweets[i].x=sc.nextInt();
			Sweets[i].y=sc.nextInt();
			Sweets[i].z=sc.nextInt();
		}

		long ans = 0;

		for (int j=0;j<8;j++) {
			long tmpx = 0;
			long tmpy = 0;
			long tmpz = 0;
			for (int i=0;i<n;i++) {
				long partx = (j&4)>0 ? Sweets[i].x : -Sweets[i].x;
				long party = (j&2)>0 ? Sweets[i].y : -Sweets[i].y;
				long partz = (j&1)>0 ? Sweets[i].z : -Sweets[i].z;

				Sweets[i].value=partx+party+partz;
			}
			Arrays.sort(Sweets, Comparator.comparing((Sweet a) -> a.value));

			for (int i=0;i<m;i++) {
				tmpx += Sweets[i].x;
				tmpy += Sweets[i].y;
				tmpz += Sweets[i].z;
			}
			ans = Math.max(ans, Math.abs(tmpx)+Math.abs(tmpy)+Math.abs(tmpz));
		}
		System.out.println(ans);
	}


}

class Sweet {
	long x;
	long y;
	long z;
	long value;
}
