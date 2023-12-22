import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String[] S = new String[N];
    for(int i=0; i<N; i++) {
      S[i] = scan.next();
    }
    scan.close();

    Arrays.sort(S);

    String before = S[0];
    ArrayList<String> maxString = new ArrayList<String>();
    int count = 0;
    int max = 0;
    for(int i=0; i<N; i++) {
      if(!before.equals(S[i])) {
        if(max == count) {
          maxString.add(before);
        }
        else if(max < count) {
          maxString.clear();
          maxString.add(before);
          max = count;
        }
        count = 1;
        before = S[i];
      }
      else {
        count++;
      }
    }
    if(max == count) {
      maxString.add(before);
    }
    else if(max < count) {
      maxString.clear();
      maxString.add(before);
    }

    for(int i=0; i<maxString.size(); i++) {
      System.out.println(maxString.get(i));
    }
  }
}