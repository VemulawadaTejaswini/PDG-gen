import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, k = 0 ,i = 0;
		k = sc.nextInt();n = sc.nextInt();
      	String[] e = new String[n];
		while(i < 3) {
          e[i] = sc.next();
          i++;
        }
		if(Integer.parseInt(e[ 0 ]) == 0) System.out.println(Integer.parseInt(e[ 1 ]) * 2);
		else System.out.println(Integer.parseInt(e[ 0 ]) * 2);
	}
}
