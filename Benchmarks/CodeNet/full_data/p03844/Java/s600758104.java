import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        String op;

        A = sc.nextInt();
        op = sc.next();
        B = sc.nextInt();
        
        if(op.equals("+")){
            System.out.println(A + B);
        }else if(op.equals("-")){
            System.out.println(A - B);
        }

        sc.close();
    }
}