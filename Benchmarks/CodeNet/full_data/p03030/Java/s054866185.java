import java.util.*;
class Rest{
	String[] name = new String[200];
	int[] point = new int[200];
}
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Rest rest = new Rest();
		Rest restans = new Rest();
		String[] data = new String[n];
		int[] ans = new int[n];

		for (int i = 0;i<n ;i++ ) {
			rest.name[i] = sc.next();
			rest.point[i] = sc.nextInt();
			data[i] = rest.name[i];
		}

		Arrays.sort(data);

		for (int i = 0;i<n ;i++ ) {
			for (int j = 0;j<n ;j++ ) {
				if (data[i] == rest.name[j]) {
					restans.point[i] = rest.point[j];
					restans.name[i] = data[i];
				}
			}
		}

		for (int i = 0;i<n ;i++ ) {
			for (int j = i+1;j<n ;j++ ) {
				if (restans.name[i].equals(restans.name[j])) {
					if (restans.point[i]<restans.point[j]) {
						int temp = restans.point[i];
						restans.point[i] = restans.point[j];
						restans.point[j] = temp;
					}
				}
			}
		}

		for (int i = 0;i<n ;i++ ) {
			for (int j = 0;j<n ;j++ ) {
				if (restans.name[i].equals(rest.name[j])) {
					if (restans.point[i]==rest.point[j]) {
						ans[i]=j+1;
						break;
					}
				}
			}
		}

		for (int i = 0;i<n ;i++ ) {
			System.out.println(ans[i]);
		}



	}
}
