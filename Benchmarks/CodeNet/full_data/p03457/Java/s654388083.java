import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int t[] = new int[N];
    int x[] = new int[N];
    int y[] = new int[N];
    if(N==1){
      if(x[0]+y[0]!=t[0]){
        System.out.println("No");
        return;
      }
    }
    for(int i=0;i<N;i++){
      t[i]=sc.nextInt();
      x[i]=sc.nextInt();
      y[i]=sc.nextInt();
    }
    if(N==1){
      if(x[0]+y[0]!=t[0]){
        System.out.println("No");
        return;
      }
    }
    for(int i=0;i<N-1;i++){
      if(!isVisit(i,t,x,y)){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
  
  public static boolean isVisit(int i,int[] t,int[] x,int[] y){
    int time =t[i+1]-t[i];
    int xs=Math.abs(x[i+1]-x[i]);
    int ys=Math.abs(y[i+1]-y[i]);
    if(xs+ys>time){
      return false;
    }else if(xs+ys==time){
      return true;
    }else{
      if((xs+ys)%2==time%2){
        return true;
      }
    }
    return false;
  }
    
    
  

  
}
