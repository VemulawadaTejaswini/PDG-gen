import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int K = Integer.parseInt(s[0]);
    int S = Integer.parseInt(s[1]);
    
    int count = 0;
    for(int i = 0; i <= K; i++){
      for(int j = 0; j <= K; j++){
        int k = S - i - j;
        if(k <= K && k >= 0){
          count++;
          System.out.println(i + " "+j+ " "+ k);
        }
      }
    }
   System.out.println(count);
  }
}