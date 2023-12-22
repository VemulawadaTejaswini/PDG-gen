import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		int changeMin = n;

		for (int i=0; i<n; i++){
			int change = 0;
			for (int j=0; j<n; j++){
				String dir = s.substring(j, j+1);
				if (i > j){
					if ("W".equals(dir)){
						change++;
					}
				} else if(i < j){
					if ("E".equals(dir)){
						change++;
					}
				}
			}
			changeMin = Math.min(changeMin, change);
		}
		System.out.println(changeMin);
	}
}
