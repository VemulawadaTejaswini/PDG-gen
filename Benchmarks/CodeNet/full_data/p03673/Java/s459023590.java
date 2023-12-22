import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] b = new int[n];    
      for(int i=0;i<n;i++){
        b[i] = sc.nextInt();
      }
      for(int i=b.length-1;i>=0;i-=2){
        System.out.print(b[i]+ " ");
      }
      for(int i=b.length%2;i<b.length;i+=2){
        System.out.print(b[i]+ " ");
      }
      System.out.println();
    }
}