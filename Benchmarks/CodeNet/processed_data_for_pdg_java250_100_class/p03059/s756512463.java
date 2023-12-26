class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int T = scan.nextInt();
    T = T / A * B;
    System.out.println(T);
  }
}
