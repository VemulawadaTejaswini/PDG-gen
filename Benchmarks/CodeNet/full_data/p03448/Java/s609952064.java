import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();

    int answer = 0;

    for (int i = 0; i <= a; i++) {
      for (int j = 0; j <= b; j++) {
				int kk = x - 500 * i - 100 * j;
				int k = kk / 50;
				if (k >= 0 && k <= c && kk % 50 == 0) {
					answer++;
				}
      }
    }
    System.out.println(answer);
  }
}
