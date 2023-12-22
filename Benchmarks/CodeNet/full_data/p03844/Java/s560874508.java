import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();

        if(op.charAt(0)=="+"){
            System.out.println(a+b);
        }else{
            System.out.println(a-b);
        }
    }
}
