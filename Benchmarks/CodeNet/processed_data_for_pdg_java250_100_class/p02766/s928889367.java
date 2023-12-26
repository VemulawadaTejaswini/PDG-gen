class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.next()); 
    int k = Integer.parseInt(scan.next()); 
    int d; 
    int count; 
    d = n;
    if(d >= k){
      for(count = 0; (d / k) >= k; count ++){
        d = d / k;
      }
      count ++;
    }
    else{
      count = 0;
    }    
    System.out.println(count + 1);
  }
}
