public class Main {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int stage = N;
    int di[] = new int[N];
    for(int i = 0; i<N; i++){ 
      di[i] = sc.nextInt();
    }
    Arrays.sort(di);
    for(int i =0; i<N; i++ ) {
      if(i != N-1) {
        if(di[i] == di[i+1]){
          stage--;
        }
      }
    }
    System.out.println(stage);
  }
}
