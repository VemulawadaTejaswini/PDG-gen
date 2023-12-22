import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.next());
    int[] card = new int[num];
    int alice = 0;
    int bob = 0;
    for(int i = 0; i < num; i++){
      card[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(card);
    for (int i = (num-1); i>=0; i-=2){
      alice += card[i];
      bob += card[i-1];
    }
    System.out.println(alice - bob);
  }
}
