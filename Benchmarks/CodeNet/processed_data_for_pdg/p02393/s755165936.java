public class Main
{
  public static void main(String[]args)
  {
  Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    int c=input.nextInt();
    if (a>b && b>c)
      System.out.println(c+" "+b+" "+a);
    else if(b>a && a>c)
      System.out.println(c+" "+a+" "+b);
     else if(b>c && c>a)
      System.out.println(a+" "+c+" "+b);
     else if(c>b && b>a)
      System.out.println(a+" "+b+" "+c);
     else if(c>a && a>b)
      System.out.println(b+" "+a+" "+c);
     else if (a>c && c>b)
      System.out.println(b+" "+c+" "+a);
     else if (a==b && c>a && c>b)
       System.out.println(a+" "+b+" "+c);
     else if (b==c && a>b && a>c)
       System.out.println(b+" "+c+" "+a);
     else if (a==c && b>a && b>c)
        System.out.println(a+" "+c+" "+b);
     else if (a==b && c<a && c<b)
       System.out.println(c+" "+b+" "+a);
     else if (b==c && a<b && a<c)
       System.out.println(a+" "+b+" "+c);
     else if (a==c && b<a && b<c)
        System.out.println(b+" "+c+" "+a);
  }
}
