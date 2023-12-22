import java.util.*;
import java.math.BigDecimal;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 各座標
    BigDecimal w = new BigDecimal(sc.nextInt());
    BigDecimal h = new BigDecimal(sc.nextInt());
    BigDecimal x = new BigDecimal(sc.nextInt());
    BigDecimal y = new BigDecimal(sc.nextInt());
    
    // 分割方法が複数あるか
    int isSeparateMulti = 0;
    // 対角線上に x,y があれば複数ある (m * y == h * x)
    if(w.multiply(y).compareTo(h.multiply(x)) == 0){
      isSeparateMulti = 1;
    }
    
    // まず W,Hの長方形の面積
    BigDecimal sqWH = w.multiply(h);
    BigDecimal sqInner = new BigDecimal(0);
    if(w.divide(h, 11, BigDecimal.ROUND_HALF_UP)
       .compareTo(
         x.divide(y, 11, BigDecimal.ROUND_HALF_UP)
       ) > 0)
    {
      // x,y が対角線よりも 0,H ~ W,Hの編寄り にある
      // ならば、 x,0~x,Hで分割する
      
      sqInner = x.multiply(h);
      
    }else{
      // x,y が対角線よりも W,0 ~ W,Hの編寄り にある
      // ならば、 0,y~W,yで分割する

      sqInner = y.multiply(w);
      
    }

    // 出力
	if(sqWH.subtract(sqInner.multiply(new BigDecimal(2)))
       .compareTo(
         new BigDecimal(0)
       ) > 0)
    {
      // sqInnerが小さい方の場合
	  System.out.println(sqInner);   
    }else{
      // sqInnerが大きい方の場合
	  System.out.println(sqWH.subtract(sqInner));
    }      
    System.out.println(isSeparateMulti);   
  }
}
