import java.util.*;
class Main {
  
  
  
  public static int maxsearch(int g[]){
    
    int max=-100;
    
    for(int i=0; i<g.length; i++){
      if(max<g[i]){
        max = g[i];
        }
      }
        
      return max;
      
  }
      
      
      
   public static int minsearch(int g[]){
    
    int min=100;
    
    for(int i=0; i<g.length; i++){
      if(min>g[i]){
        min = g[i];
        }
        
       }
      return min;
      
  }
      
  
  public static void main (String[] args)  {
    
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    
    int x []= new int[N];
    int y []= new int[M];
    
    String ans = "War";
    
    for(int i=0; i<N; i++){
      x[i]= sc.nextInt();
      }
      
    for(int i=0; i<M; i++){
      y[i]= sc.nextInt();
      }
      
      
      int xf = 0;
      int yf=0;
      
      if(X<Y){
        xf = maxsearch(x);
        yf = minsearch(y);
           if(xf<yf && xf<Y && yf >X){
          ans = "No War";
            }
          }
    
    
    
    System.out.println(ans);



  }
}