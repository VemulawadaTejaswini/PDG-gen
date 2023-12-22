import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  //もちの枚数
      int n = sc.nextInt();
      //もちの直径
      Set<Integer> num = new HashSet<>();
      for(int i = 0; i < n; i++){
        int di = sc.nextInt();
        num.add(di);
      }
      System.out.println(num.size());
      
    }
}