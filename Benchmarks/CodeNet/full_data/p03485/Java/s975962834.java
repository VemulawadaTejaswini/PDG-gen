import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ab = a+b;
        int ans = ab%2==0? (ab/2):(ab/2+1);
        System.out.println(ans);
    }
}