import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    double t = sc.nextDouble();
    double a = sc.nextDouble();
    double h[] = new double[n];
    double dist[] = new double[n];
    int answer =0;
    double tmp=10000000;
    for(int i=0;i<n;i++){
      h[i]=sc.nextDouble();
    }
    for(int i=0;i<n;i++){
      dist[i]=Math.abs(a-(t-h[i]*0.006));
    }
    for(int i=0;i<n;i++){
      if(tmp>dist[i]){
        answer =i;
        tmp=dist[i];
      }
    }
    System.out.println(answer+1);
    
    
    
    
  }
  

  
}