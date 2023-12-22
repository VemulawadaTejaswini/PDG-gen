import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int valueLCM = 0;
    ArrayList<Long> list = new ArrayList<>();
    for(int i=0;i<N;i++){
      list.add(sc.nextLong());
    }
    for(int i=0; i<list.size()-1; i++) {
       if(i==0){
         valueLCM = calcLCM(list.get(i),list.get(i+1));
       }else{
         valueLCM = calcLCM(valueLCM,list.get(i+1));
       }
    }    
  }
  
  
   private static long calcLCM(long val1, long val2) {
        long maxValue = Math.max(val1, val2);
        long minValue = Math.min(val1, val2);
        long val3    = maxValue * minValue;
        if(minValue==0) return maxValue;
        long temp;
        while( (temp=maxValue%minValue)!=0 ) {
            maxValue=minValue;
            minValue=temp;
        }

        return val3/minValue;
    }
  

  
}