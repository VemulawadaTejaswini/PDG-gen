import java.util.*;
public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    int cityCnt = sc.nextInt();
    int m[] = new int[cityCnt+1];
    int p[] = new int[cityCnt];
    int at = 0;
    for(int i=0;i<cityCnt+1;i++){
      m[i]=sc.nextInt();
    }
    for(int i=0;i<cityCnt;i++){
      p[i]=sc.nextInt();
    }
    if(m[0]>=p[0]){
      at+=p[0];
      p[0]=0;
    }else{
      at+=m[0];
      p[0]=p[0]-m[0];
    }
    for(int i=0;i<cityCnt-1;i++){
      if(m[i+1]>=p[i]+p[i+1]){
        at +=p[i]+p[i+1];
        p[i]=0;
        p[i+1]=0;
      }else{
        at+=m[i+1];
        if(p[i]>=m[i+1]){
        
        }else{
           p[i+1]=p[i+1]+p[i]-m[i+1];
        }
      }
    }
    if(p[cityCnt-1]>0){
      if(p[cityCnt-1]>m[cityCnt]){
        at+=m[cityCnt];
      }else{
        at+=p[cityCnt-1];
      }
    }
    System.out.println(at);
  }
}