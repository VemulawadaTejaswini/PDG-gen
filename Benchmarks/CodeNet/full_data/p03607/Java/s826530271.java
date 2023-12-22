import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 0;
        for(int i = 0; i < n ; i++){
          int next = sc.nextInt();
          if(!list.contains(next)){
            list.add(next);
          }else{
            int index = list.indexOf(next);
            list.remove(index);
          }
        }
      
          System.out.println(list.size());
	}
}
