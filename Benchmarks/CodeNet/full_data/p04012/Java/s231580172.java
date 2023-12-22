import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] s = sc.next().split("");
      HashMap<String,Integer> map = new HashMap<>();
      
      for(String t:s){
        int number = map.getOrDefault(t,0);
        map.put(t,number+1);
      }
      
      System.out.println(check(map)?"Yes":"No");
      
     
      
      
      
    }
  private static boolean check(HashMap<String,Integer> mp){
    for(Integer b:mp.values()){
      if(b % 2 != 0) return false;
    }
    return true;
  }
  
}