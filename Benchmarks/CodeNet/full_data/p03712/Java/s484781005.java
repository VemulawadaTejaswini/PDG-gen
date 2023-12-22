import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int h = scan.nextInt();
        int w = scan.nextInt();
        String[] s = new String[h];
        for(int i=0;i<s.length;i++)
        {
            s[i] = scan.next();
        }
        
        for(int i=0;i<=h+1;i++)
        {
            if(i==0 || i==h+1)
            {
                for(int j=0;j<w+2;j++)
                {
                    System.out.print("#");
                }
                System.out.println();
                continue;
            }
            System.out.print("#");
            System.out.print(s[i-1]);
            System.out.print("#");
            System.out.println();
        }
    }
}
