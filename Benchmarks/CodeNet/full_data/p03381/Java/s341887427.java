import java.util.*;
public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] X = new long[N+10];
    long[] copy = new long[N+10];
    for(int i =1;i<=N;i++){
      X[i] = sc.nextLong();
      copy[i] = X[i];
    }
    quickSort(X,1,N);
    long C1 = X[N/2];
    long C2 = X[N/2+1];

    for(int i =1;i<=N;i++){
      if(copy[i]<=C1){
        System.out.println(C2);
      }else if(copy[i]>=C2){
      System.out.println(C1);
      }
    }
    sc.close();
  }
  
 public static void quickSort(long[] array, int left, int right) {
        int curleft = left;
        int curright = right;
        long pivot = array[(curleft + curright) / 2];
        
        do {
            while (array[curleft] < pivot) {
                curleft++;
            }
            
            while (array[curright] > pivot) {
                curright--;
            }
            if (curleft <= curright) {
                swap (array, curleft++, curright--);
            }
        } while (curleft <= curright);
        
        if (left < curright) {
            quickSort(array, left, curright);
        }
        
        if (curleft < right) {
            quickSort(array, curleft, right);
        }
    }
    
    private static void swap (long[] array, int idx1, int idx2) {
        long tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
}
