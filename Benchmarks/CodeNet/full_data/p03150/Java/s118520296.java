import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		
		String bar[] = {"k", "e", "y", "e", "n", "c", "e"};
		
		int check_point = 0;
		int hit = 0;
		for (int i=0; i<7; i++) {
			for (int j=check_point; j<l; j++) {
				if (s.substring(j,j+1).equals(bar[i])) {
					check_point = j+1;
					hit++;
					break;
				}
			}
		}
		
		if (hit == 7) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}