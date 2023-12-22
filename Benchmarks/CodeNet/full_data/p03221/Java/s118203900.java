import java.util.*;
 
public class Main{
  static String[] zero = {"00000", "0000", "000", "00", "0"};
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    
    int[][] val = new int[M][3];
    for(int i = 0; i < M; i++){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      val[i][0] = a;
      val[i][1] = b;
      val[i][2] = i;
    }
    Arrays.sort(val, (a, b) -> Integer.compare(a[1], b[1]));
    
    String[] ans = new String[M];
    int[] count = new int[N+1];
    for(int i = 0; i < M; i++){
      StringBuilder sb = new StringBuilder();
      int a = val[i][0];
      count[a]++;
      
      if(a < 10){
        sb.append(zero[0]);
        sb.append(a);
      }else if(a < 100){
        sb.append(zero[1]);
        sb.append(a);
      }else if(a < 1000){
        sb.append(zero[2]);
        sb.append(a);
      }else if(a < 10000){
        sb.append(zero[3]);
        sb.append(a);
      }else if(a < 100000){
        sb.append(zero[4]);
        sb.append(a);
      }else{
        sb.append(a);
      }
      
      int b = count[a];
      if(b < 10){
        sb.append(zero[0]);
        sb.append(b);
      }else if(b < 100){
        sb.append(zero[1]);
        sb.append(b);
      }else if(b < 1000){
        sb.append(zero[2]);
        sb.append(b);
      }else if(b < 10000){
        sb.append(zero[3]);
        sb.append(b);
      }else if(b < 100000){
        sb.append(zero[4]);
        sb.append(b);
      }else{
        sb.append(b);
      }
      
      ans[val[i][2]] = (new String(sb));
    }
    
    for(int i = 0; i < M; i++){
     System.out.println(ans[i]); 
    }
  }
}