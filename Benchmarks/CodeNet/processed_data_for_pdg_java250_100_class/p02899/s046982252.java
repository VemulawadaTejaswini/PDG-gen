class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int A[] = new int[N];
    int stu[] = new int[N];
    for (int i = 0;i < N;i++) {
      A[i] = scan.nextInt();
      stu[A[i] - 1] = i + 1;
    }
    for (int i = 0;i < N;i++) {
      System.out.print(stu[i] + " ");
    }
  }
}
