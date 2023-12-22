import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int H = Integer.parseInt(S[0]);
    int W = Integer.parseInt(S[1]);
    int count = 0;
    for(int i = 0; i < H; i++){
      String T = sc.nextLine();
      for(int j = 0; j < W; j++){
        if(T.charAt(j) == '#'){
          count++;
        }
      }
    }
    System.out.println(count == (H + W - 1) ? "Possible" : "Impossible");
  }
}