import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a1 = x*h;
        int a2 = (w-x)*h;
        int b1 = y*w;
        int b2 = (h-y)*w;

        int min1 = Math.min(a1,a2);
        int min2 = Math.min(b1,b2);

        int ans = Math.max(min1,min2);
        System.out.println(ans);
        if(min1 == min2) System.out.println(1);
        else System.out.println(0);
    }
}