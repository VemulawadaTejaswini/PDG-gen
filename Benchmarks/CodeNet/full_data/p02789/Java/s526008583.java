import java.util.*;
 
public class pudge{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a == b) System.out.printf("Yes\n");
        else System.out.printf("No\n");
        in.close();
    }
}
