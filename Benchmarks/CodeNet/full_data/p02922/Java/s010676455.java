import java.util.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = 1;

        if (b==1) {
            System.out.println(0);
        } else {

        int cnt = 0;
        while (d < b) {
            d += a-1;
            cnt += 1;
        }
        System.out.println(cnt);
    }
}
}