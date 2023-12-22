import java.util.*;
import java.util.Collections;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
        ArrayList<int> list = new ArrayList<>();
        double result = 0;
        int i;

      for (i = 0; i < a; i++){
        list.add(sc.nextInt());
      }
      
      Colletions.sort(list);
      result = list.get(0);
      
      for(i = 1; i < a; i++){
        result = (result + list.get(s))/2.0;
      }

      System.out.println(result);
	}
}
