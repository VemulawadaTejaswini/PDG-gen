import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int cardNum = Integer.parseInt(sc.next());
        int count = Integer.parseInt(sc.next());
      	List<Long> list = new ArrayList<>();
      for (int x = 1; x <= cardNum; x++) {
        list.add(Long.parseLong(sc.next()));
      }
      for (int x = 1; x <= count; x++) {
        int amount = Integer.parseInt(sc.next());
        long num = Integer.parseInt(sc.next());
        for (int y =1; y<= amount; y++) {
           	list.add(num);
        }
      }
      Collections.sort(list,Collections.reverseOrder());
      long res =0;
      for (int x =1; x<=cardNum;x++ ) {
      	res += list.get(x-1);
      }
      System.out.println(res);
  }
}