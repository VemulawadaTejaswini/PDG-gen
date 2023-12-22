import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    HashMap<Integer,Integer> map = new HashMap<>(n*2/3);

    int result = 0;
    for(int i = 1; i <= n; i++) {
      int love = scan.nextInt();
      if(map.containsKey(love)) {
        if(map.get(love) == i) {
          result++;
        }
        map.remove(love);
      }else {
        map.put(i,love);
      }
    }

    System.out.println(result);
  }
}
