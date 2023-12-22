
import java.util.Scanner;


public class Main {
    int a;
    String s;
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Main m =new Main();
        m.a = stdIn.nextInt();
        m.s = stdIn.next();
        System.out.print(m.check());
    }
    private String check(){
        if(a>=3200) return s;
        return String.valueOf("red");
    }
}