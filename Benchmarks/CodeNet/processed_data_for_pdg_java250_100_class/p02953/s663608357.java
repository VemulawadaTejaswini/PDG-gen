public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long H[] = new long[N];
    for(int i=0;i<N;i++){
      H[i]=sc.nextLong();
    }
    for(int i=N-1;i>0;i--){
      if(H[i-1]-H[i]>=2){
        System.out.println("No");
        return;
      }else if(H[i-1]-H[i]==1){
        H[i-1]=H[i-1]-1;
      }else{
        continue;
      }
    }
    System.out.println("Yes");
  }
}
