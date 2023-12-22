import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //初期値N
        int n = scn.nextInt();
        //値K
        int k = scn.nextInt();
        //実施回数
        System.out.print("繰り返す数：");
        int count = scn.nextInt();
        for (int i = 0; i < count; i++) {
            n -= k;
            if(n < 0) {
                n *= -1;
            }
        }
        System.out.println(n);
    }
}