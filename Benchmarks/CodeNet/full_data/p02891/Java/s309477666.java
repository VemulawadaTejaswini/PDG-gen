import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] chars = s.toCharArray();


    BigInteger count = BigInteger.ZERO;
    for(int i = 0; i< s.length() -1; i++){
      if(chars[i] == chars[i+1]){
        count = count.add(BigInteger.ONE);
        chars[i+1] = 'A';
      }
    }
    long kl = sc.nextLong();
    BigInteger k = BigInteger.valueOf(kl);
    count = count.multiply(k);
    boolean isSameChar = chars[0] == chars[s.length()-1];

    if(s.length() == 1 && kl > 2){
      System.out.println(kl % 2 == 0 ? kl / 2 :(kl - 1) / 2);
    } else if(isSameChar){
      count = count.add(k);
      System.out.println(count.subtract(BigInteger.ONE));
    } else {
      System.out.println(count);
    }

  }

}
