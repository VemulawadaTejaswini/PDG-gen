import java.util.*;
import java.math.BigDecimal;


public class Main {
  
  private static final boolean DEBUG = false;
  
  private static final BigDecimal DIV = new BigDecimal(13);
  private static final int REST = 5;
  
  public static void main(String[] args) {
    String S;
    try(Scanner sc = new Scanner(System.in)) {
      S = sc.next();
    }
    int p = (int)Math.pow(10, 9) + 7;
    int answer = 0;
    Iterator<String> itr = getIterator(S);
    while ( itr.hasNext() ) {
      String v = itr.next();
      if ( isOk(v) ) {
        debug(v);
        answer += 1;
        answer = answer % p;
      }
    }
    System.out.println(answer);
  }
  
  private static void debug(String msg) {
    if ( DEBUG == false ) {
      return;
    }
    System.out.println("#" + msg);
  }
  
  private static boolean isOk(String v) {
    BigDecimal numV = new BigDecimal(v);
    return numV.remainder(DIV).intValue() == REST;
  }
  
  private static Iterator<String> getIterator(String S) {
    final int n = S.length();
    char cFirst = S.charAt(0);
    if ( n == 1 ) {
      return createIterator(cFirst);
    }
    final String rest = S.substring(1);
    final Iterator<String> baseItr = createIterator(cFirst);
    return new Iterator<String>() {
      private String prefix;
      private String value;
      private volatile Iterator<String> childItr;
      
      public boolean hasNext() {
        while ( childItr == null || childItr.hasNext() == false ) {
          if ( baseItr.hasNext() == false ) {
            return false;
          }
          childItr = getIterator(rest);
          prefix = baseItr.next();
        }
        String child = childItr.next();
        value = prefix + child;
        return true;
      }
      
      public String next() {
        return value;
      }
      
    };
  }
  
  private static Iterator<String> createIterator(char c) {
    if ( c == '?' ) {
      return Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9").iterator();
    }
    else {
      return Arrays.asList(String.valueOf(c)).iterator();
    }
  }
  
}