import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(" ",0);
    int N = Integer.parseInt(s[0]);
    int Q = Integer.parseInt(s[1]);
    String s1 = sc.nextLine();
    String buf = "";
    int cnt = 0;
    for (int i = 0;i < Q;i++) {
		s = sc.nextLine().split(" ",0);
      	buf = s1.substring(Integer.parseInt(s[0]) -1,Integer.parseInt(s[1]));
      	for (int j = 1;j < buf.length();j++) {
          if ('C' == buf.charAt(j)&&'A' == buf.charAt(j-1)) {
            cnt++;
          }
        }
      	System.out.println(cnt);
        cnt = 0;
    }
    
  }

}
