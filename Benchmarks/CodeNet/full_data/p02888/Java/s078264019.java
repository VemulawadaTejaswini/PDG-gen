import java.util.*;
public class Triangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<>();
		// 整数の入力
		int number = sc.nextInt();
		for(int i = 0; i < number; i++){
      array.add(sc.nextInt());
    }

    Collections.sort(array);
    int total = 0;
    for(int i = 0; i < array.size()-2; i++){

        for(int j = 1+i; j < array.size()-1; j++){

            for(int k = 1+j; k < array.size(); k++){
              if(array.get(i)+array.get(j) <= array.get(k))
                break;
              total++;
            }

        }

    }

    System.out.println(total);
	}
}