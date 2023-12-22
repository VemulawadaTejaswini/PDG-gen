import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        for(int i=0; i<c; i++)
        {
            if(a >= 1)
                a--;
            else if(b >=1 && a<b)
                b--;
            else
                continue;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
