import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String cul = sc.next();
        int B = sc.nextInt();

        if(cul.equals("+")){
            System.out.println((A+B));
        }else if(cul.equals("-")){
            System.out.println((A-B));
        }
    }
}