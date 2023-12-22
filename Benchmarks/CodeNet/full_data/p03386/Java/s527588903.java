import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        if(a<1 || b < 1 || k < 1)
            System.exit(0);
        if(b > a)
            System.exit(0);
        if(k > 100) 
            System.exit(0);
        if(b-a+1 <= k) {
            for(int i = a;i <= b;i++) {
                System.out.println(i);
            }
        } else {
            int i,j;
            for(i = a;i < k+a;i++) {
                System.out.println(i);
            }
            for(j = b-k+1;j <=b;j++) {
                if(j == i-1)
                    continue;
                System.out.println(j);
            }
        }
    }
}
