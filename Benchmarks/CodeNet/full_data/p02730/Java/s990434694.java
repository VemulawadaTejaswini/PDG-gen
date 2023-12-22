import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int n = s.length();
    //Sの1文字目から(N-1)/2文字目までからなる文字列
    String s_sub_bf = s.substring(0,n/2);
    StringBuffer sb_bf = new StringBuffer(s_sub_bf);
    String s_rev_bf = sb_bf.reverse().toString();
    //Sの(N+3)/2文字目からN文字目までからなる文字列
    String s_sub_af = s.substring((n+2)/2,n);
    StringBuffer sb_af = new StringBuffer(s_sub_af);
    String s_rev_af = sb_af.reverse().toString();
    System.out.println(s_sub_bf.equals(s_rev_bf) && s_sub_af.equals(s_rev_af)?
                       "Yes":"No");
  }
}