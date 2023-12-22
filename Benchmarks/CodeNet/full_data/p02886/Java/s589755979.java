import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<>();
		// 整数の入力
		int number = sc.nextInt();
    for(int i = 0; i < number; i++){
      array.add(sc.nextInt());
    }

    int total = 0;
    for(int i = 0; i < array.size();i++){
      for(int j = 1+i; j < array.size(); j++){
        total += array.get(i)*array.get(j);
      }
    }

    System.out.println(total);
	}
}