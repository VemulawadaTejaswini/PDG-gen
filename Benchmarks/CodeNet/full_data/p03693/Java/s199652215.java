import java.util.Scanner;
class Main
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integers: ");
        int number=sc.nextInt();
        if(number%4==0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}