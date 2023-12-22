
import java.util.Scanner;


public class Main {
    static int a;
    static String s;
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        a = stdIn.nextInt();
        s = stdIn.next();
        System.out.print(check());
    }
    private static String check(){
        if(a>=3200) return s;
        return String.valueOf(a);
    }
}