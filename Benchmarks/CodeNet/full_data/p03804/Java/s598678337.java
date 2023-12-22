import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String[] a = new String[n];
		String[] b = new String[m];

		for(int i = 0; i < n; i++){
			a[i] = scanner.next();
		}
		for(int i = 0; i < m; i++){
			b[i] = scanner.next();
		}

		int count = 1;
		for(int i = 0; i < n-m; i++){
			for(int j = 0; j < n-m; j++){
				String str = a[i].substring(j, j+m);
				if(str.equals(b[0])){
					for(int k = 1; k < m; k++){
						String str2 = a[i+k].substring(j, j+m);
						if(str2.equals(b[i+k])){
							count++;
						}
					}
					if(count == m){
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		System.out.println("No");
	}
}