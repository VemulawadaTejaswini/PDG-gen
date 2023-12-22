import java.util.*;

public class Main {


//    public static int gcd(int x, int y){
//        if (y==0) return x;
//        return gcd(y, x%y);
//    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println(a+a-1);
        }else if (a == b){
            System.out.println(a+b);
        }else{
            System.out.println(b+b-1);
        }

    }
}


