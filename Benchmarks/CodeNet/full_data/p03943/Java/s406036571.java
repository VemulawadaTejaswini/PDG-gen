import java.util.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a + b == c) || (a + c == b) ){
             out.println("Yes");
        }else if(b + c == a){
            out.println("Yes");
        }else{
            out.println("No");
        }

    }
}