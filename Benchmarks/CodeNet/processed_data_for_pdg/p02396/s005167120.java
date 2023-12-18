class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
      int n;
      int i = 0;
     while (true){
        n = scan.nextInt();
        if ( n == 0 )break;
          i++;
       System.out.println("Case "+i+": "+n);
     }
  }
}
