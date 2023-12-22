import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      long sum = 0;
      int num = 0;
      Map<Integer,Integer> map = new HashMap<Integer,Integer>();
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int i = 0;i < n;i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(map.containsKey(a)){
          map.put(a,map.get(a)+b);
        }else{map.put(a,b);
        list.add(a);
        }
      }
      Collections.sort(list);
      for(int i = 0;i < list.size();i++){
      	int p = list.get(i);
        num += map.get(p);
        if(num < m)sum += (long)p*map.get(p);
        else {
          sum += (long)p*(map.get(p)-num+m));
          break;
        }
      }
      System.out.println(sum);
    }
}
