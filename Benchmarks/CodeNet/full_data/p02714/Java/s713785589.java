import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    String s = sc.next();
    int count = 0;
    
    for(int i = 0; i < N-2; i++){
      for(int j = i+1; j < N-1; j++){
        for(int k = j+1; k < N; k++){
          if(s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(k)&& s.charAt(i) != s.charAt(k) && j-i != k-j)
            count++;
        }
      }
    }
    System.out.println(count);
  }
}