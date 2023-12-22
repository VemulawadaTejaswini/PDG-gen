import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        String s = key.nextLine();
        boolean flag = false;
        for(int i = 0; i<s.length(); i++)
        {
            
            if(s.charAt(i)== '7')
                flag = true;
        }
        if(flag == true)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}