import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    String S = sc.next();
    int[] ls = new int[Q];
    int[] rs = new int[Q];
    for (int i = 0; i < Q; i++) {
      ls[i] = sc.nextInt();
      rs[i] = sc.nextInt();
    }
    
    int tmp;
    int[] ACloc = new int[S.length() / 2];
    int ACnum = 0;
    int stringlength = 0;
    while((tmp = S.indexOf("AC")) != -1) {
      S = S.substring(tmp+2);
      ACloc[ACnum] = tmp + stringlength;
      stringlength += (tmp + 2);
      ACnum++;
    }
    for (int i = 0; i < Q; i++) {
      int count = 0;
      for (int j = 0; j < ACnum; j++) {
        if (ls[i]-1 <= ACloc[j] && ACloc[j] < rs[i]-1) {
          count++;
        } else if (ACloc[j] > rs[i] - 2) {
          break;
        }
      }
     System.out.println(count); 
    }
  }
}