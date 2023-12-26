class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    long N = scan.nextLong(); 
    long A = scan.nextLong(); 
    long B = scan.nextLong(); 
    long ans = 0;
    if(A == 0){
      System.out.println(0);
    }
    else{
      ans = (N / (A + B)) * A;
      if((N % (A + B)) >= A){
        ans = ans + A;
      }
      else{
        ans = ans + N % (A + B);
      }
      System.out.println(ans);
    }
  }
}
