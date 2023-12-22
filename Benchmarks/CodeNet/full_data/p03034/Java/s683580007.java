import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long array[] = new long[N];
    for (int i=0;i<N;i++){
      array[i] = sc.nextLong();
    }
    long ans = 0;
    for (int p=1;p<N;p++){
      //goalにつく場合
      if((N-1)%p == 0){
        long tmp = 0;
        long c = 0;
        int i = 0;
        int j = N-1;
        while(i<j){
          c += array[i]+array[j];
          tmp = Math.max(tmp,c);
          i += p;
          j -= p;
        }
       ans =  Math.max(tmp,ans);
      }
    }
        
        
    
    
    
    System.out.println(ans);
  }
}