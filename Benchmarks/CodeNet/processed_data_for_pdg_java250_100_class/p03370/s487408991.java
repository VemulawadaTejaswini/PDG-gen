class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    int x = sc.nextInt(); 
    int[] param = new int[n];
     int sum = 0; 
    for(int i=0 ; i<n ; i++){
      param[i] = sc.nextInt();
      sum += param[i];
    }
    int min = x;
    for(int i=0 ; i<n ; i++){
      if(param[i]<=min){
        min = param[i];
      }
    }
    int num = (x-sum)/min;
    System.out.println(n+num);
  }
}
