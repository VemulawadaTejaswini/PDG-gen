import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        int c=reader.nextInt();
        if((a==b&&b!=c)||(a==c&&a!=b)||(b==c&&c!=a))
          System.out.println("Yes");
        else
            System.out.println("No");

    }
}
