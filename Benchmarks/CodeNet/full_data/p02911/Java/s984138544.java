import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner read = new Scanner(System.in);
      int n = read.nextInt(); int k = read.nextInt();
      int q = read.nextInt();
      int array[] = new int[n];
      for(int i = 0; i<q; i++){
          int t = read.nextInt();
          array[t-1]++;
      }
      for(int i = 0; i<n; i++){
          if(array[i]>q-k){
              System.out.println("Yes");
          }
          else{
              System.out.println("No");
          }
      }
      
    }
}