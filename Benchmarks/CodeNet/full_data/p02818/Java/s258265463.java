import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        if(a <= k){
            k -= a;
            a = 0;
            b -= k;
            if(b < 0)
                b = 0;
        }else{
            a -= k;
        }
        System.out.println(a+" "+b);
    }
}