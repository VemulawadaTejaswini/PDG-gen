import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 11;
        double n = sc.nextDouble();
        double ans = Math.ceil(n/a)*2;
        if(n%11<7 && n%11!=0) ans--;
        System.out.println((long)ans);
    }
}