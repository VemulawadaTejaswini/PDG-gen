import java.util.*;
import static java.lang.System.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A <= 8 && B <= 8) {
            out.print("Yay!");
        } else {
            out.print(":(");
        }
        
    }
}
