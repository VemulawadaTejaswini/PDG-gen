import java.util.*;

public class Main {	
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      String S = sc.next();
      int N = S.length(); long total =0;
      ArrayList<Long> list = new ArrayList<Long>();
	  for (int i =0; i<Math.pow(2,N-1); i++) {
        String bit = Integer.toBinaryString(i); //iをビットに変換
        int count =0, pos =0;
        for (int j=0; j<bit.length(); j++) {
          if (bit.charAt(j) == '1' ) {
            list.add(Long.parseLong(S.substring(pos,j+1)));
            count++; pos = j+1;
          }
        }
        if (count == 0) {
          list.add(Long.parseLong(S));
        } else {
          list.add(Long.parseLong(S.substring(pos,N))); //最も右の数値をリストに格納
        }
      }
      for (int j =0; j<list.size(); j++) {
        total += list.get(j);
      }
	  System.out.println(total);
	}
}