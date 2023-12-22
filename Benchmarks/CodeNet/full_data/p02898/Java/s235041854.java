import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int k = sc.nextInt();
		int h;
        int count = 0;
        for (int i=0; i<n; i++) {
            if (sc.nextInt() >= k) {
                count++;
            }
        }
        System.out.print(count);
    }
}