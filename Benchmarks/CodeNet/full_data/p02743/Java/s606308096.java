import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger aa = new BigInteger(sc.next());
    BigInteger bb = new BigInteger(sc.next());
    BigInteger cc = new BigInteger(sc.next());
    BigInteger ans1 = new BigInteger("0");
    BigInteger ans2 = new BigInteger("0");
    BigInteger ans3 = new BigInteger("0");
    BigInteger ans4 = new BigInteger("0");
    BigInteger ans5 = new BigInteger("0");
    BigInteger ans6 = new BigInteger("0");
        BigInteger ans7 = new BigInteger("0");
        BigInteger ans8 = new BigInteger("0");
        
    ans1 = aa.multiply(aa);
    ans2 = bb.multiply(bb);
    ans3 = cc.multiply(cc);
    ans4 = aa.multiply(bb);
    ans5 = bb.multiply(cc);
    ans6 = cc.multiply(aa);
    ans7 = ans1.add(ans2.add(ans3));
    ans8 = ans4.add(ans5.add(ans6));
    ans8 = ans8.add(ans8);
    if(ans7.compareTo(ans8)==1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  

  
}
