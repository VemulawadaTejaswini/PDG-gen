import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];

        int num = 0;
        int pre = -2;

        for(int i = 1; i<=N; i++) {
            a[i] = sc.nextInt();
            if(a[i] == i) {
                if(pre == i-1) pre = 0;
                else {
                    num++;
                    pre = i;
                }
            }
        }
        System.out.println(num);




    }
}