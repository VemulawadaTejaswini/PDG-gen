class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a[] = new int[3];
    a[0] = scan.nextInt();
    a[1] = scan.nextInt();
    a[2] = scan.nextInt();
    int tmp;
    for(int i=0 ; i<2 ; i++){
      for(int j=2 ; j>i ; j--){
        if(a[j-1] > a[j]){
          tmp = a[j-1];
          a[j-1] = a[j];
          a[j] = tmp;
        }
      }
    }
    System.out.println(a[0] + " " + a[1] + " " + a[2]);
  }
}
