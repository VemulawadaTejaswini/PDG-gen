import java.util.*;
import java.util.Collections;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
       ArrayList<Integer> list = new ArrayList<>();
      double result = 0;
      for (int i = 0; i < a; i++){
        list.add(sc.nextInt());
      }
      
      Colletions.sort(list);
      result = list(0);
      for(int i = 1; i < a; i++){

        result = (result + list(i))/2;
      }
      System.out.println(result);
	}
}