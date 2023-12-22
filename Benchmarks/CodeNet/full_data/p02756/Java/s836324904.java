import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean isReverse = false;//反転中フラグ
    String s = sc.next();
    StringBuilder sb = new StringBuilder(s);//初期状態
    StringBuilder sb1 = new StringBuilder("");//頭にくっつける用
    StringBuilder sb2= new StringBuilder("");//お尻にくっつける用
    int Q = sc.nextInt();
    int tmp = 0;
    String tmpS;
    for(int i = 0;i<Q;i++){
      if(sc.nextInt()==1){
        isReverse = !isReverse;
      }else{
        tmp=sc.nextInt();
        tmpS=sc.next();
        if(isReverse&&tmp==1){//反転中∧頭につける⇔お尻につける奴のお尻につける
          sb1.append(tmpS);
        }else if(isReverse&&tmp==2){//反転中∧お尻につける⇔頭につける奴のお尻につける
          sb2.append(tmpS);
        }else if(!isReverse&&tmp==1){//正常位∧頭につける⇔頭につける奴のお尻につける
          sb2.append(tmpS);
        }else{//正常位∧お尻につける⇔お尻につけるやつのお尻につける
          sb1.append(tmpS);
        }
      }
    }
    
    if(isReverse){
    System.out.println(sb1.reverse().append(sb).append(sb2));
    }else{
     System.out.println(sb1.append(sb.append(sb2)));
    }
  } 
}
