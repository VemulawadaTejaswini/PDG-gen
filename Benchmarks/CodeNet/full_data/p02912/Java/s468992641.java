import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
      int n = read.nextInt(); int m = read.nextInt(); 
      ArrayList<Integer> array = new ArrayList<Integer>();
      for(int i = 0; i<n; i++){
          array.add(read.nextInt());
      }
      Collections.sort(array);
      for(int i = 0; i<m; i++){
          int t = Math.round(array.get(n-1)/2);
          array.add(t);
          array.remove(n-1);
//          System.out.println(array.toString());
          int lo = 0;
          int hi = n-2;
          int mid = 0;
          while(lo<=hi){
              mid = lo+(hi-lo) /2;
              if(array.get(n-1) == array.get(mid)){
                  break;
              }
              else if(array.get(n-1)>array.get(mid)){
                  lo = mid+1;
              }
              else{
                  hi = mid-1;
              }
          }
          if(mid != n-1){
//            System.out.println(mid);
            if(array.get(mid)< array.get(n-1)){
                array.add(mid + 1, array.get(n-1));
            }
            else{
              array.add(mid, array.get(n-1));
          }
          }
          else{
              array.add(mid, array.get(n-1));
          }
          
          array.remove(n);
//          System.out.println("sorted: " + array.toString());
      }
      long sum = 0;
      for(int i = 0; i<n; i++){
          sum+=array.get(i);
      }
      System.out.println(sum);
    }
    
}
