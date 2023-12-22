import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long A=sc.nextInt();
        long B=sc.nextInt();
        if((A+B)%2==0){
            System.out.println((A+B)/2);
        }else{
            System.out.println("IMPOSSIBLE");

        }







    }
    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
