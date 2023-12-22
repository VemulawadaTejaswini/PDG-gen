import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    int c=input.nextInt();
    if(b>=1 && b<=1000 && c>=1 && c<=1000 && a>=(b+c) && a<=10000)
    {
     a=a-b;
     int temp=a%c;
     System.out.println(temp);
    }
  }
}