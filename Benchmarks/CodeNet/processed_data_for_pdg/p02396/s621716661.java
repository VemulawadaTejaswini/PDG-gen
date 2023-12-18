 class Main
 {
   public static void main(String args[])
   { 
    Scanner sc =new Scanner(System.in);
    int i  = sc.nextInt();
    int j = 1;
    while (i != 0)
    {
      System.out.printf("Case %d: %d",j,i);
      System.out.println();
      j = ++ j;
      i = sc.nextInt();
    }
   }
 }
