import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String[] hiki = scan.nextLine().split(" ");
    int H = Integer.parseInt(hiki[0]);
    int W = Integer.parseInt(hiki[1]);
    hiki = scan.nextLine().split(" ");
    int h = Integer.parseInt(hiki[0]);
    int w = Integer.parseInt(hiki[1]);
    System.out.println((H-h)*(W-w));
  }
}
