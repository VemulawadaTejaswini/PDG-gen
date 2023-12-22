import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int sum = 0;
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();
        for(int i = 0; i < 3; i++) {
        	if (ss[i] == tt[i])
        		sum ++;
        }
        System.out.println(sum);

	}


}
