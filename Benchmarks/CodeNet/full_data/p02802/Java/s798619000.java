import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int m = sc.nextInt();
        int miss = 0, ans = 0;
        int tmp;String tmp2;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i < m;i++){
          tmp = sc.nextInt();
          tmp2 = sc.next();
          if(tmp2.equals("AC")){
            list.add(tmp);
          }else{
			for (int j = 0; j < list.size(); j++) {
     		 if(list.get(j) == tmp){miss -= 1;}
    		}            
            miss += 1;
          }
        }
        System.out.println(new HashSet<>(list).size() + " " + miss);
    }
}