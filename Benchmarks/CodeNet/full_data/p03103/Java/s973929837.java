import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] list = new int[1000000001];
        for(int i = 0; i < n; i++) {
        	int a = scan.nextInt();
        	int b = scan.nextInt();
        	list[a] += b;
        }

        int len = list.length;
        long ans = 0;
        for(int i = 0; i < len; i++) {
        	if(list[i] == 0)
        		continue;

        	if(m >= list[i]) {
        		ans += (long)i * (long)list[i];
        		m -= list[i];
        	}else {
        		ans += m * i;
        		break;
        	}
        }
        System.out.println(ans);
    }
}