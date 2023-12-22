import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean isReverse = false;//反転中フラグ
    String s = sc.next();
    int Q = sc.nextInt();
    
    for(int i = 0;i<Q;i++){
      if(sc.nextInt()==1){
        isReverse = !isReverse;
      }else{
        s = build(s,isReverse,sc.nextInt(),sc.next());
      }
    }
    StringBuffer sb = new StringBuffer(s);
    if(!isReverse){
    System.out.println(s);
    }else{
     System.out.println(sb.reverse());
    }
  }
  
  public static String build(String s , boolean isReverse,int F , String C){
    if(isReverse&&F==1){
      s = s+C;
    }else if(isReverse&&F==2){
      s = C+s;
    }else if(!isReverse&&F==1){
      s = C+s;
    }else{
      s = s+C;
    }
    return s;
  }
      
  

  
}