import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] ans = new int[3];

        ans[0] = a*x + b*y;
        if(x >= y){
            ans[1] = c*y*2 + (x-y) * a;
            ans[2] = c*x*2;
        }else{
            ans[1] = c*x*2 + (y-x) * b;
            ans[2] = c*y*2;
        }

        Arrays.sort(ans);

        System.out.println(ans[0]);
    }
}