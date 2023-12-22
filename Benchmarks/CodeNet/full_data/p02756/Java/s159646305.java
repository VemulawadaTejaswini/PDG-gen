import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int q = sc.nextInt();
    
    boolean flg = false;
    
    for(int j=0;j<q;j++){
      if(sc.nextInt()==1){
        flg = !flg;
      }else{
        if(sc.nextInt()==1){
          if(flg){
            s = s+sc.next();
          }else{
            s = sc.next()+s;
          }
        }else{
          if(flg){
            s= sc.next()+s;
          }else{
            s = s+sc.next();
          }
        }
      }
    }
    StringBuffer sb = new StringBuffer(s);
    
    if(flg){
      sb = sb.reverse();
    }
      

    System.out.println(sb);
      
    

  }
}