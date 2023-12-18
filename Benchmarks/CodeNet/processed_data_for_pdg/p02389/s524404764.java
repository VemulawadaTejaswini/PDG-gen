 class Main
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    int v = sc.nextInt();
    int h = sc.nextInt();
    int a = v * h ;
    int l = 2 * ( v + h );
    System.out.println(a + " " + l);
   }
 }
