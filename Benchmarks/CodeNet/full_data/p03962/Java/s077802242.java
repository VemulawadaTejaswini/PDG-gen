import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = 3;
        if(a==b && b==c)
            ans = 1;
        else if(a==b ^ b==c)
            ans = 2;
        System.out.println(ans);
    }
}