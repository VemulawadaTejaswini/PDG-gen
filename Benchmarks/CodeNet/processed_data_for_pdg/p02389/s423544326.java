class Main
{
   public static void main(String[] args)
   {
      Scanner stdIn = new Scanner(System.in);
      int a = stdIn.nextInt();
      int b = stdIn.nextInt();
      int c = a*b;
      int d = a+a+b+b;
      System.out.println( c + " " + d );
   }
}
