public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt();
    int arr[] = new int[N+1];
    for(int i = 1; i<=M; i++){
      int n = sc.nextInt();
      arr[n] = 1;
    }
    int opt1 = 0; 
    int opt2 = 0; 
    for(int i = X; i>=0; i--){
      opt1 += arr[i]; 
    }
    for(int i = X; i<=N; i++){
      opt2 += arr[i]; 
    }
    System.out.println(Math.min(opt1, opt2));
  }
}
