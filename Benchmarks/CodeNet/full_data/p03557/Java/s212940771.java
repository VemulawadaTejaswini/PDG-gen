import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<Long> listA = new ArrayList<>();
    long[] listB = new long[N];
    List<Long> listC = new ArrayList<>();
    
    String[] A = sc.nextLine().split(" ");
    String[] B = sc.nextLine().split(" ");
    String[] C = sc.nextLine().split(" ");
    for(int i = 0; i < N; i++){
      listA.add(Long.parseLong(A[i]));
      listC.add(Long.parseLong(C[i]));
      listB[i] = Long.parseLong(B[i]);
    }
    
    Collections.sort(listA);
    Collections.sort(listC, Collections.reverseOrder());
    
    long sum = 0;
    for(int i = 0; i < N; i++){
      long n = listB[i];
      long a = N;
      long c = N;
      int bs1 = 0;
      int bs2 = N-1;
      while(true){
        int bs = (bs1+bs2)/2;
        if(listA.get(bs) >= n){
          bs2 = bs;
        }else{
          bs1 = bs+1;
        }
        
        if(bs1 == bs2){
          if(listA.get(bs1) >= n){
            a = bs1;
          }else{
            a = bs1+1;
          }
          break;
        }
      }
      
      bs1 = 0;
      bs2 = N-1;
      while(true){
        int bs = (bs1+bs2)/2;
        if(listC.get(bs) <= n){
          bs2 = bs;
        }else{
          bs1 = bs+1;
        }
        
        if(bs1 == bs2){
          if(listC.get(bs1) <= n){
            c = bs1;
          }else{
            c = bs1+1;
          }
          break;
        }
      }
      sum += a * c;
    }
    System.out.println(sum);
  }
}