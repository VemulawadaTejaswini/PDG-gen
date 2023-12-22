import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        if ((b-a)%2!=0){
            if ((b-1)>(n-a)){
                System.out.println(n-a);
                return;
            }else {
                System.out.println(b-1);
                return;
            }
        }else {
            System.out.println((b-a)/2);
        }


    }
}