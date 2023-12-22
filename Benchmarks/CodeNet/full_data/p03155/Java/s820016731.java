import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        System.out.println((n - w + 1) * (n - h + 1));
        scan.close();
    }
}
