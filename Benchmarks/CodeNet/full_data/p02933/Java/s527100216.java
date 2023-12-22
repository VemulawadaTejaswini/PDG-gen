import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        System.out.print(validate(a, s));
    }

    private static String validate(Integer a, String s){
        if(a >= 3200){
            return s;
        }else{
            return "red";
        }
    }
}
