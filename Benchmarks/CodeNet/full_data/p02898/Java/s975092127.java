import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int h[] = new int[n];
    int answer = 0;
    for(int i=0;i<n;i++){
      if(sc.nextInt()>=k){
        answer = answer +1;
      }
    }
    System.out.println(answer);
  }
  

  
}