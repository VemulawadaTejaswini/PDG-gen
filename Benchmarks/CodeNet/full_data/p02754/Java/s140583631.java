import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        int blue = key.nextInt();
        int red = key.nextInt();

        if(blue %2 != 0)
        {
            blue = blue + 1;
        }    
            
        System.out.println(blue);
        

        

        
    }
}