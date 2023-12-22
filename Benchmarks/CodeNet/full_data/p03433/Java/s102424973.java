import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int a = scan.nextInt();
        k%=500;
        if(k>a)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}
