import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int n = s.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum += s.nextInt();
        }
        if((h-sum)>0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}