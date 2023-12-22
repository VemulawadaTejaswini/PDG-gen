import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double x[] = new double[n];
    double y[] = new double[n];
    for(int i=0;i<n;i++){
      x[i]=sc.nextDouble();
      y[i]=sc.nextDouble();
    }
    
    double dist[][]=new double[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        dist[i][j]=calcDistance(x[i],y[i],x[j],y[j]);
      }
    }
    double answer =0;
    
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        answer = answer + dist[i][j];
      }
    }
    System.out.println(answer/n);
    
    
  }
  
  public static double calcDistance(double x1 , double y1,double x2 , double y2){
    double dist =0;
    dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    return dist;
  }
    
  

  
}