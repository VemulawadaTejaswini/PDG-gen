import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        
        out.println(a+b>=c ? b+c : a+2*b+1);
    }
}
