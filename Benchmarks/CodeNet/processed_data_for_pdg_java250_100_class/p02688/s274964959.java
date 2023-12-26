public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int sunu[] = new int[N];
    for(int i=0;i<K;i++){
      int d =  sc.nextInt();
      for(int j=0; j<d; j++){
        sunu[sc.nextInt()-1]++;
      }
    }
    int count = 0;
    for(int i=0;i<N;i++){
      if(sunu[i]==0){
        count++;
      }
    }
    System.out.println(count);  
  }
}
