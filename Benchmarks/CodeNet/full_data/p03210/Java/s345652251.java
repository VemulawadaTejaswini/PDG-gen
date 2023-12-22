import java.util.*;
/**
 *
 * @author kouki
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toshi = sc.nextInt();
        if (toshi==3||toshi==5||toshi==7) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}