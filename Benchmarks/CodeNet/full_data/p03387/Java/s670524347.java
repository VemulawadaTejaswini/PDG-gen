import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
		int max = Math.max(a,Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;
      
      	int cnt = max - mid;
        mid += cnt;
      	cnt += (max - mid + 1) / 2;
        if((max - mid) % 2 != 0) cnt++;
        System.out.println(cnt);
    }
}