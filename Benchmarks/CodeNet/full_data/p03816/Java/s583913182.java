import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<Integer> cards = new HashSet<Integer>();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i = 0; i < num; i++) {
      cards.add(sc.nextInt());
    }
    int res = cards.size();
    if(res % 2 == 0) res--;
    System.out.println(res);
  }
}