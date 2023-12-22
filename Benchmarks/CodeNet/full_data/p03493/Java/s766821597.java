import java.util.Scanner;
public class Main{
  public static void main (String[] args){
    Scanner Scan = new Scanner(System.in);
    String[] mas = Scan.next().split("");
    int cnt = 0;
    for(String x : mas){
      if(x == "1")cnt++;
    }
    System.out.prinitln(cnt);
  }
}