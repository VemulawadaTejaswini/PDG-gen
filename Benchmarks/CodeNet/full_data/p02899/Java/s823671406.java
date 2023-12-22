import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
          list.add(Integer.parseInt(sc.next()));
        }
      
        int target = 1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < n; i++) {
          if (i == 0) {
            builder.append(list.indexOf(target) + 1);
          } else {
            builder.append(" " + (list.indexOf(target) + 1));
          }          
          target++;
        }
    
		// 出力
		System.out.println(builder.toString());
	}
}
