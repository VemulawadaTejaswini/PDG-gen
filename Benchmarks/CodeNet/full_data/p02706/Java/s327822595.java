import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cost = new int[m];
        int sum = 0;
        for(int i = 0;i < m;i++){
            sum += sc.nextInt();
        }

        System.out.println(sum <= n?n-sum:-1);
    }
}