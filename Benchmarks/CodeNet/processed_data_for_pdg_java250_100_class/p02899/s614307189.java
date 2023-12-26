public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      int kids[] = new int[N+1];
      for(int i=1; i<=N; i++){
      	int s = sc.nextInt();
        kids[s] =  i;
      }
      for(int i=1; i<=N; i++){
        System.out.print(kids[i]+" ");
      }
    }
}
