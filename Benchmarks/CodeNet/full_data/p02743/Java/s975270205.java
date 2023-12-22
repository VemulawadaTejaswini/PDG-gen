import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int d = c - (a + b);

        if(d <= 2) System.out.println("No");
        else if(4 * a * b < (d * d)) System.out.println("Yes");
        else System.out.println("No");
    }
}