import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int time[] = new int[n];
    int count = 0;
    
    for(int i = 0 ; i < n ; ++i){
      time[i] = sc.nextInt();
    }
    
    int total = t;
    
    for(int i = 0 ; i < n-1 ; ++i){
      if(time[i+1]-time[i] <= t){
        total += time[i+1]-time[i];
      }else{
        total += t;
      }
    }
    
    System.out.println(total);
    
  }
}

