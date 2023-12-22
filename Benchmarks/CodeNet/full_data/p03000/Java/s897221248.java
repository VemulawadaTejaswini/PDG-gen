import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        int x = 0;
        int[] ary = new int[a];
        for (int i = 0; i < a; i++) {
        	ary[i] = sc.nextInt();
        }
        for (int i = 0; x <= b && i <= a; i++) {
        	x += ary[i];
        	ans++;
        }
        System.out.println(ans);

    }

}