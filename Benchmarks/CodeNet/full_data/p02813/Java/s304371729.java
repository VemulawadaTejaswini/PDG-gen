import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] facts = {1,2,6,24,120,720,5040,40320};
    int[] P = new int[N];
    int[] Q = new int[N];
    int[] PH = new int[N];
    int[] QH = new int[N];
    int i;
    int a = 0;
    int b = 0;
    for(i=0;i<N;i++){
      P[i] = Integer.parseInt(sc.next());
    }
    for(i=0;i<N;i++){
      Q[i] = Integer.parseInt(sc.next());
    }
    
    for(i=0;i<N;i++){
      for(int j=i+1;j<N;j++){
        if(P[i]>P[j]){
          PH[i]++;
        }
        if(Q[i]>Q[j]){
          QH[i]++;
        }
      }
    }
    
    for(i=0;i<N-1;i++){
      a+=facts[N-2-i]*PH[i];
      b+=facts[N-2-i]*QH[i];
    }
    if(a>b){
      System.out.print(a-b);
    }else{
      System.out.print(b-a);
    }
    System.out.flush();
    
  }
}