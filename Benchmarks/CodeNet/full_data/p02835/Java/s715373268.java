import java.util.Scanner;
public class polygon
{
public  static  void main(String args[])
{
Scanner inp= new Scanner(System.in);
int a=inp.nextInt();
    int b=inp.nextInt();
    int c=inp.nextInt();
    if((a+b+c)<22)
    {
        System.out.println("win");
    }
    else if((a+b+c)>=22)
    {
        System.out.println("bust");
    }
}
}
