import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
        int N = sc.nextInt();
        int L = sc.nextInt();
      
        List<String> list = new ArrayList<String>();
      
        for (int i = 0; i < N; i++){
          list.add(sc.next());
        }
      
        // 並び替え
        Collections.sort(list);
      
        // 回答提出用
        StringBuilder answer = new StringBuilder();
      
        for (int i = 0; i < N; i++){
          answer.append(list.get(i));
        }
       
        System.out.println(answer);

    }
}