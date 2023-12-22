// package whatever; // don't place package name!


import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int i = 0;
        while(sc.hasNext()){
          A[i] = sc.nextInt();
          i++;
        }
        
          
        List<Integer> cardsAlice = new ArrayList<Integer>();
        List<Integer> cardsBob = new ArrayList<Integer>();
        
        for(int j = 0; j < N; j++){
          
          int[] cardInfo = getMaxCardInfo(A);
          
          if(j % 2 == 0){
            cardsAlice.add(cardInfo[0]);           
          } else if (j % 2 == 1){
            cardsBob.add(cardInfo[0]);           
          }
          A[cardInfo[1]] = 0;
        }
      
        int sumAlice = getSum(cardsAlice);
        int sumBob = getSum(cardsBob);
        
        System.out.println(sumAlice-sumBob);

    }

    private static int[] getMaxCardInfo(int[] tgtArray){
      
      int max = 0;
      int max_idx = 0;
      int[] maxPoint = new int[2];
      for (int i = 0; i < tgtArray.length; i++) {
        int v = tgtArray[i];
          if (v > max) {
              max = v;
              max_idx = i; 
          }
          
      }
      
      maxPoint[0] = max;
      maxPoint[1] = max_idx;
      
      return maxPoint;
      
    }

    private static int getSum(List<Integer> tgtArrayList){
      
      Integer sum = new Integer(0);
      for (int num :tgtArrayList){
        sum += num;
      }
      return sum.intValue();
      
    }
  
}
