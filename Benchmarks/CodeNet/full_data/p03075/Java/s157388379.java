import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(e - a <= k ? "Yay!" : ":(");
        scan.close();
    }
}