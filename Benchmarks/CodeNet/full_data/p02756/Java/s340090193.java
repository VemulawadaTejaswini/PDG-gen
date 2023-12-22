import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean isReverse = false;//反転中フラグ
    String s = sc.next();
    StringBuilder sb = new StringBuilder(s);
    int Q = sc.nextInt();
    int tmp = 0;
    String tmpS;
    for(int i = 0;i<Q;i++){
      if(sc.nextInt()==1){
        isReverse = !isReverse;
      }else{
        tmp=sc.nextInt();
        tmpS=sc.next();
        if(isReverse&&tmp==1){
          sb.append(tmpS);
        }else if(isReverse&&tmp==2){
          sb.insert(0,tmpS);
        }else if(!isReverse&&tmp==1){
          sb.insert(0,tmpS);
        }else{
          sb.append(tmpS);
        }
      }
    }
    
    if(!isReverse){
    System.out.println(sb);
    }else{
     System.out.println(sb.reverse());
    }
  }
  
  public static StringBuilder build(StringBuilder sb , boolean isReverse,int tmp , String tmpS){
    if(isReverse&&tmp==1){
      sb.append(tmpS);
    }else if(isReverse&&tmp==2){
      sb.insert(0,tmpS);
    }else if(!isReverse&&tmp==1){
      sb.insert(0,tmpS);
    }else{
      sb.append(tmpS);
    }
    return buil;
  }
      
  

  
}
