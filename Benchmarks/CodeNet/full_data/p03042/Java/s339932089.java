import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int s_fr = Integer.parseInt(s.substring(0,2));
    int s_bi = Integer.parseInt(s.substring(2,4));
    
    System.out.println((s_fr<=12 && s_fr>=00) && (s_bi<=12 && s_bi>=00)?"AMBIGUOUS":
                       ((s_fr<=12 && s_fr>=01) && s_bi>=13)?"YYMM":
                       (s_fr>=13 && (s_bi <=12 && s_bi>=01))?"MMYY":"NA");
  }
}