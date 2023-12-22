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
      Collections.sort(list);
      for (int x = 1; x <= count; x++) {
        int amount = Integer.parseInt(sc.next());
        long num = Integer.parseInt(sc.next());
        loop:for (int y =1; y<= amount; y++) {
          if (list.get(y-1) < num){
           	list.set(y-1,num);
          } else {
            Collections.sort(list);
          	continue loop;
          }
        }
        Collections.sort(list);
      }
      long res =0;
      for (Long a : list) {
      	res += a;
      }
      System.out.println(res);
  }
}