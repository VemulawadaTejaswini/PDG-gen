import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= 13){
            System.out.println(b);
        }else if (6 <= a & a <= 12){
            System.out.println(b/2);
        }else if (a <= 5){
            System.out.println(0);
        }
    }
}
