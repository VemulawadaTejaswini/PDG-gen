public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();
    int[] num = new int[Q];
    int[] count = new int[N];
    int t = 0;
    for(int i=0; i < Q; i++){
        num[i] = sc.nextInt();
        count[num[i]-1]++;
    }
    for(int j=0; j < N; j++){
        if((count[j]+K-Q) > 0){
        System.out.println("Yes");
        }else{
        System.out.println("No");
        }
    }
  }
}
