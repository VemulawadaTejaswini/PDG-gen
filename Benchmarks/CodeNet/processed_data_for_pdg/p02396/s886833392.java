class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int i=0,x=1;
    int A[] = new int[999999];
    while(x!=0){
      x = scanner.nextInt();
      A[i] = x;
      i++;
    }
    for(int j=1; j<i; j++){
      System.out.println("Case " + j + ": " + A[j-1]);
    }
  }
}
