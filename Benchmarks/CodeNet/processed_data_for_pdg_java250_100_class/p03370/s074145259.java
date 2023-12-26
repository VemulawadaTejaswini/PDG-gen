class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); 
    int X = sc.nextInt(); 
    int[] m = new int[N];
    int amount = 0;
    for(int i=0;i<N;i++){
      m[i] = sc.nextInt();
      amount += m[i];
    }
    int min = m[0];
    for(int j=1;j<N;j++){
      if(m[j]<min){
        min = m[j];
      }
    }
    int last = (X-amount)/min;
    System.out.println(N+last);
  }
}
