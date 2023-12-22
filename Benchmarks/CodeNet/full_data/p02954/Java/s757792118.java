import java.util.*;

public class Main {
  public static void main(String[] args) {
    String S;
    try(Scanner sc = new Scanner(System.in)) {
      S = sc.next();
    }
    Command command = new Command(S);
    int N = command.size();
    int tokenSize = command.getTokenSize();
    int[] c = new int[N];
    for( int i = 0; i < N; i++ ) {
      c[i] = 1;
    }
    int counter = 0;
    for ( int j = 0; j < tokenSize; j++ ) {
      String token = command.tokenAt(j);
      char tokenType = token.charAt(0);
      int tl = token.length();
      for (int k = 0; k < tl; k++) {
        c[counter+k]--;
        switch(tokenType) {
          case 'R':
            if ( (k+tl) % 2 == 0 ) {
              c[counter+tl]++;
            }
            else {
              c[counter+tl-1]++;
            }
            break;
          case 'L':
            if ( (k+tl) % 2 == 0 ) {
              c[counter-1]++;
            }
            else {
              c[counter]++;
            }
            break;
          default:
            throw new UnsupportedOperationException("Unknown token type: " + tokenType);
        }
      }
      counter += tl;
    }
    System.out.print(c[0]);
    for(int i = 1; i < N; i++) {
      System.out.print(" " + c[i]);
    }
    System.out.println();
  }

  private static class Command {
    private final int N;
    private final String S;
    private final String[] tokens;
    
    public Command(String S) {
      this.S = S;
      this.N = S.length();
      
      List<String> tokenList = new LinkedList<String>();
      char preCh = '0';
      StringBuilder buf = new StringBuilder();
      for(int i = 0; i < N; i++) {
        char ch = S.charAt(i);
        if ( preCh != '0' && ch != preCh ) {
          tokenList.add(buf.toString());
          buf.delete(0, buf.length());
        }
        buf.append(ch);
        preCh = ch;
      }
      if ( buf.length() > 0 ) {
        tokenList.add(buf.toString());
      }
      this.tokens = tokenList.toArray(new String[0]);
    }
    
    public int size() {
      return N;
    }
    
    public int getTokenSize() {
      return tokens.length;
    }
    
    public String tokenAt(int idx) {
      return tokens[idx];
    }
  }
}