import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer A = scan.nextInt();
        Integer B = scan.nextInt();


        System.out.println(Math.max(Math.max(A+B,A-B),A*B));

    }
}
