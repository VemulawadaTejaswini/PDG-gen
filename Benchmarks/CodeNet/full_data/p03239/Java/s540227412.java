import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int c[] = new int[N];
    int t[] = new int[N];
    int cmin = 1001;
    int twithin = 1001;
    
    for(int i= 0;i<N;i++){
      c[i]=sc.nextInt();
      t[i]=sc.nextInt();
      
      if(t[i]<=T && cmin>c[i]){
        //tがT以内かつcが最小になるまで値をサーチ
        twithin=t[i];
        cmin=c[i];
      }
        
    }
    if(twithin==1001){
      System.out.println("TLE");
    }else{
      System.out.println(cmin);
    }
  }
}