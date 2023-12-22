import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        long a,b,c;
        a=scan.nextLong();
        b=scan.nextLong();
        c=scan.nextLong();
        if(Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c)) System.out.println("Yes");
        else System.out.println("No");
    }
}