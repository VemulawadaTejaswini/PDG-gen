import java.util.Scanner;
public class Poor {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
       
        int y = in.nextInt();
        
        int z = in.nextInt();

        if (x == y && x == z)
        {
         System.out.println("Yes");
        }
        else if ((x == y) || (x == z) || (z == y))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}