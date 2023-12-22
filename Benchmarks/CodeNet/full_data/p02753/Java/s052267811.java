import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] arg){
        Main m = new Main();
        m.run();
    }

    void run(){
        String s = sc.next();
        if("AAA".equals(s) || "BBB".equals(s)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}