import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int bai = 1;
        for(int i = 1;i < k;i++){
            bai *= 2;
        }

        System.out.println(a+b+c+Math.max(a,Math.max(b,c))*bai);
    }
}