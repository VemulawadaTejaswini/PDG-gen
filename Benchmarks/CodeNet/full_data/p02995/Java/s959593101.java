import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = b/c-a/c;
        if(a%c==0)e++;
        int f = b/d-a/d;
        if(a%d==0)f++;
        int g = b/(d*c)-a/(d*c);
        if(a%(d*c)==0)g++;
        System.out.println((b-a+1)-(e+f-g));
    }
}