class Main{
  public static void main(String[] args){
    int n;
    int l,r;
    int ans = 0;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(int i=0;i<n;i++){
      l = sc.nextInt();
      r = sc.nextInt();
      ans += r - l + 1;
    }
    System.out.println(ans);
  }
}