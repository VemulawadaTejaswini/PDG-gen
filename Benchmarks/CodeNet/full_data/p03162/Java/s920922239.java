import java.util.Scanner;

/**
 * Created by Harry on 3/31/20.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        int a=0, b=0, c=0;
        for(int i=0; i<n ;i++){
            int curA = scanner.nextInt() + Math.max(b,c);
            int curB = scanner.nextInt() + Math.max(a,c);
            int curC = scanner.nextInt() + Math.max(a,b);
            a = curA;
            b = curB;
            c = curC;
        }
        System.out.print(Math.max(a, Math.max(b,c)));
    }
}
